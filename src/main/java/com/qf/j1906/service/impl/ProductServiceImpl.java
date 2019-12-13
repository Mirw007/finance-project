package com.qf.j1906.service.impl;

import com.qf.j1906.mapper.ProductMapper;
import com.qf.j1906.po.MsgResult;
import com.qf.j1906.po.Product;
import com.qf.j1906.po.ProductExample;
import com.qf.j1906.service.ProductService;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: dafei
 * Date: 2019/12/7 10:51
 * @Version 1.0
 */
@Service
@Slf4j

public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 通过ID查询产品
     * @param pdcId
     * @return
     */
    @Override
    public List<Product> findProductById(Long pdcId) {
        List<Product> products = redisTemplate.opsForList().range("products", 0L, -1L);
        if (products != null && products.size() > 0) {
            LinkedList<Product> linkedList = new LinkedList<>();
            for (Product product : products) {
                Long pdcId1 = product.getPdcId();
                if (pdcId1.equals(pdcId)) {
                    Product product1 = new Product();
                    product1.setPdcId(product.getPdcId());
                    product1.setPdcCode(product.getPdcCode());
                    product1.setPdcDate(product.getPdcDate());
                    product1.setPdcDeadline(product.getPdcDeadline());
                    product1.setPdcGain(product.getPdcGain());
                    product1.setPdcLevel(product.getPdcLevel());
                    product1.setPdcName(product.getPdcName());
                    product1.setPdcPrice(product.getPdcPrice());
                    product1.setPdcRate(product.getPdcRate());
                    product1.setPdcRisk(product.getPdcRisk());
                    product1.setPdcType(product.getPdcType());
                    product1.setPdcValue(product.getPdcValue());
                    linkedList.add(product1);
                }
            }
            if(linkedList.size()>0){
                return linkedList;
            }
        }
        List<Product> products1 = productMapper.selectProductsById(pdcId);
        for (Product product : products1) {
            redisTemplate.opsForList().leftPush("products", product);
        }
        return products1;
    }

    /**
     * 两表联查查询所有产品所有信息
     * @return
     */
    @Override
    public List<Product> findAll() {
        List<Product> range = redisTemplate.opsForList().range("products", 0L, -1L);
        if (range != null && range.size() > 0) {
            return range;
        }
        List<Product> products = productMapper.selectAll();
        for (Product product : products) {
            redisTemplate.opsForList().leftPush("products", product);
        }
        return products;
    }
    /**
     * 查历史最高利率
     *
     * @return
     */
    @Override
    public MsgResult selectProductTypeAndDeadLineAndRate() {
        List<Product> products = productMapper.selectProductTypeAndDeadLineAndRate();
        MsgResult msgResult = new MsgResult();
        msgResult.setCode(200);
        msgResult.setMsg("success");
        msgResult.setData(products);
        return msgResult;
    }

    /**
     * 查最低利率
     *
     * @return
     */
    @Override
    public MsgResult selectProductTypeAndDeadLineAndRateX() {
        List<Product> products = productMapper.selectProductTypeAndDeadLineAndRateX();
        MsgResult msgResult = new MsgResult();
        msgResult.setCode(200);
        msgResult.setMsg("success");
        msgResult.setData(products);
        return msgResult;
    }

    /**
     * 查所有product
     *
     * @return
     */
    @Override
    public MsgResult findAllProduct() {
        ProductExample example = new ProductExample();
        ProductExample.Criteria criteria = example.createCriteria();
        List<Product> products = productMapper.selectByExample(example);
        MsgResult msgResult = new MsgResult();
        msgResult.setCode(200);
        msgResult.setMsg("success");
        msgResult.setData(products);
        return msgResult;
    }

    /**
     * 根据产品类型查询产品信息（产品名字、一周最高收益率、一周最低收益率、产品类型、定期时长）
     * @return
     */
    @Override
    public List<Product> findProductByType() {
        //先查询redis中是否有所需要的数据
        List<Product> lists = redisTemplate.opsForList().range("products1", 0L, -1L);
        if (lists != null && lists.size() >0){
            return lists;
        }
        //如果redis中没有值，则需要从数据库中取值，然后放入redis中
        List<Product> products = productMapper.selectProductByType();
        for(Product product: products){
            redisTemplate.opsForList().leftPush("products1",product);
        }
        return products;
    }

    /**
     * 根据产品定期时长查询产品信息（产品名字、一周最高收益率、一周最低收益率、产品类型、定期时长小于3个月）
     * @return
     */
    @Override
    public List<Product> findProductByDeadline() {
        //先查询redis中是否有所需要的数据
        List<Product> lists = redisTemplate.opsForList().range("products2", 0L, -1L);
        if (lists != null && lists.size() >0){
            return lists;
        }
        List<Product> productList = productMapper.selectProductByDeadLine();
        for(Product product: productList){
            redisTemplate.opsForList().leftPush("products2",product);
        }
        return productList;
    }

    /**
     * 根据产品定期时长查询产品信息（产品名字、一周最高收益率、一周最低收益率、产品类型、定期时长大于3个月）
     * @return
     */
    @Override
    public List findProductMoreThreeMonth() {
        //先查询redis中是否有所需要的数据
        List<Product> productList = redisTemplate.opsForList().range("products3", 0L, -1L);
        if (productList != null && productList.size() > 0){
            return productList;
        }
        List<Product> products = productMapper.selectProductByDeadline();
        for (Product product:products){
            redisTemplate.opsForList().leftPush("products3",product);
        }
        return products;
    }

    /**
     * 模糊查
     * @param keyword
     * @return
     */
    @Override
    public MsgResult productFuzzySearchBykeyword(String keyword) {
        List<Product> products = productMapper.productFuzzySearchBykeyword(keyword);
        MsgResult msgResult = new MsgResult();
        msgResult.setCode(200);
        msgResult.setMsg("success");
        msgResult.setData(products);
        return msgResult;
    }

}
