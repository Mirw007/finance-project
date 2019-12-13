package com.qf.j1906.mapper;

import com.qf.j1906.po.Product;
import com.qf.j1906.po.ProductExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ProductMapper {
    int countByExample(ProductExample example);

    int deleteByExample(ProductExample example);

    int deleteByPrimaryKey(Long pdcId);

    int insert(Product record);

    int insertSelective(Product record);

    List<Product> selectByExample(ProductExample example);

    Product selectByPrimaryKey(Long pdcId);

    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);
//    通过ID查询产品
    List<Product> selectProductsById(Long pdcId);
//  查询所有产品
    List<Product> selectAll();

    /**
     * create by dafei
     */
    /**
     *最高利率
     * @return
     */
    List<Product> selectProductTypeAndDeadLineAndRate();

    /**
     * 最低利率
     * @return
     */
    List<Product> selectProductTypeAndDeadLineAndRateX();

    /**
     * 查所有
     * @return
     */
    List<Product> selectProductsAndRate();
    /**
     * 根据产品类型查询产品信息（产品名字、产品编号、一周最高收益率、一周最低收益率、产品类型、定期时长）
     */
    List<Product> selectProductByType();

    /**
     * 根据定期时长查询产品信息（产品名字、产品编号、一周最高收益率、一周最低收益率、产品类型、定期时长小于3个月）
     */
    List<Product> selectProductByDeadLine();

    /**
     * 根据定期时长查询产品信息（产品名字、产品编号、一周最高收益率、一周最低收益率、产品类型、定期时长大于3个月）
     */
    List<Product> selectProductByDeadline();

    /**
     * 查询全部产品信息（产品名字、一周最高收益率、一周最低收益率、产品类型、定期时长)
     */
    List<Product> selectProducts();
    /**
     * 模糊查
     * @param keyword
     * @return
     */
    List<Product> productFuzzySearchBykeyword(String keyword);

}