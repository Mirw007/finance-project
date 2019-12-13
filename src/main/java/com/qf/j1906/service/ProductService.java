package com.qf.j1906.service;

import com.qf.j1906.po.MsgResult;
import com.qf.j1906.po.Product;

import java.util.List;

/**
 * @Author: 刘旭
 * Date: 2019/12/7 10:49
 * @Version 1.0
 */
public interface ProductService {
    List<Product> findProductById(Long pdcId);
    List<Product> findAll();
    /**
     * 查询最高利率等
     * @return
     */
    MsgResult selectProductTypeAndDeadLineAndRate();

    /**
     * 查询最低利率等
     * @return
     */
    MsgResult selectProductTypeAndDeadLineAndRateX();



    /**
     * 查所有
     * @return
     */
    MsgResult findAllProduct();

    /**
     * 查所有包括rate
     * @return
     */
//    MsgResult selectProductsAndRate();
    /**
     * 根据产品类型查询产品信息（产品名字、一周最高收益率、一周最低收益率、产品类型、定期时长）
     * @return
     */
    List<Product> findProductByType();

    /**
     *根据产品定期时长查询产品信息（产品名字、一周最高收益率、一周最低收益率、产品类型、定期时长小于3个月）
     * @return
     */
    List<Product> findProductByDeadline();

    /**
     * 根据产品定期时长查询产品信息（产品名字、一周最高收益率、一周最低收益率、产品类型、定期时长大于3个月）
     * @return
     */
    List<Product> findProductMoreThreeMonth();

/*    *//**
     * 查询全部产品信息（产品名字、一周最高收益率、一周最低收益率、产品类型、定期时长)
     * @return
     *//*
    List<Product> findProducts();*/
    /**
     * 模糊查
     * @param keyword
     * @return
     */

    MsgResult productFuzzySearchBykeyword(String keyword);

}
