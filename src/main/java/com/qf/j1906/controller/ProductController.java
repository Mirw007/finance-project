package com.qf.j1906.controller;

import com.qf.j1906.po.MsgResult;
import com.qf.j1906.po.Product;
import com.qf.j1906.service.ProductService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.Date;
import java.util.List;

/**
 * @Author: 刘旭
 * Date: 2019/12/7 10:48
 * @Version 1.0
 */
@Slf4j
@RestController
public class ProductController {
    @Autowired
    private ProductService productService;
    @CrossOrigin
//    @ApiOperation(value = "根据ID查询产品信息",notes="传入一个pdcId",httpMethod = "GET",consumes = "application/x-www-form-urlencoded")
    @ApiOperation(value = "根据ID查询产品信息")
    @ApiImplicitParams(@ApiImplicitParam( name="pdcId",value = "产品ID",paramType = "query",required = true,dataType = "Long"))
    @RequestMapping(value = "/getProductById",method = RequestMethod.GET)
    public MsgResult getSingleProduct(@ApiIgnore @RequestParam(value = "pdcId",required = false)Long pdcId){
        List productList = productService.findProductById(pdcId);
        MsgResult msgResult = new MsgResult();
        msgResult.setCode(200);
        msgResult.setMsg("success");
        msgResult.setData(productList);
        log.info("111111111111111根据ID查询产品信息");
        return msgResult;
    }
    @CrossOrigin
    @ApiOperation(value = "查询所有产品信息")
    @RequestMapping(value = "findAll",method = RequestMethod.GET)
    public MsgResult getAllProduct(){
        List<Product> productList = productService.findAll();
        MsgResult msgResult = new MsgResult();
        msgResult.setCode(200);
        msgResult.setMsg("success");
        msgResult.setData(productList);
        log.info("查询所有产品信息");
        return msgResult;
    }
    /**
     * 查历史最高利率
     * @return
     */
    @CrossOrigin
    @ApiOperation(value = "查历史最高利率")
    @RequestMapping(value = "/selectProductTypeAndDeadLineAndRate",method = RequestMethod.GET)
    public  MsgResult selectProductTypeAndDeadLineAndRateFun(){
        MsgResult msgResult = productService.selectProductTypeAndDeadLineAndRate();
        log.info("查历史最高利率");
        return msgResult;
    }
    /**
     * 查历史最低利率
     * @return
     */
    @CrossOrigin
    @ApiOperation(value = "查历史最低利率")
    @RequestMapping(value = "/selectProductTypeAndDeadLineAndRateX",method = RequestMethod.GET)
    public  MsgResult selectProductTypeAndDeadLineAndRateFunX(){
        MsgResult msgResult1 = productService.selectProductTypeAndDeadLineAndRateX();
        log.info("查历史最低利率");
        return msgResult1;
    }
    /**
     * 查询所有product
     * @return
     */
    @CrossOrigin
    @ApiOperation(value = "查询product单表所有产品信息")
    @RequestMapping(value = "/findAllProduct",method = RequestMethod.GET)
    public MsgResult findAllProductFun(){
        MsgResult allProduct = productService.findAllProduct();
        log.info("查询product单表所有产品信息");
        return allProduct;
    }
    /**
     *  查寻product和rate
     * @return
     */

    /**
     * 根据产品类型查询产品信息（查询pdcType为买卖灵活类型产品主页面）
     */
    @ApiOperation(value = "通过类型查询产品")
    @RequestMapping(value = "/getProductByType",method = RequestMethod.GET)
    @CrossOrigin
    public MsgResult selectMoreProduct(){
        MsgResult msgResult = new MsgResult();
        List<Product> product = productService.findProductByType();
        msgResult.setCode(200);
        msgResult.setMsg("按类型查询成功" + product);
        msgResult.setData(product);
        log.info("通过类型查询产品");
        return msgResult;
    }
    /**
     * 根据产品定期时长查询产品信息（查询pdcDeadline大于0个小于三个月的产品信息：产品名字、一周最高收益率、一周最低收益率、产品类型、定期时长）
     */
    @ApiOperation(value = "查询定期时长少于三个月产品")
    @RequestMapping(value = "/getProductByDeadlineLessThreeMonth",method = RequestMethod.GET)
    @CrossOrigin
    public MsgResult selectLessThreeMonthProduct(){
        MsgResult msgResult = new MsgResult();
        List<Product> product = productService.findProductByDeadline();
        msgResult.setCode(200);
        msgResult.setMsg("根据产品定期时长查询产品信息成功" + product);
        msgResult.setData(product);
        log.info("查询定期时长少于三个月产品");
        return msgResult;
    }
    /**
     * 根据产品定期时长查询产品信息（查询pdcDeadline大于三个月的产品信息：产品名字、一周最高收益率、一周最低收益率、产品类型、定期时长）
     */
    @ApiOperation(value = "查询定期时长大于三个月的产品")
    @RequestMapping(value = "/getProductByDeadlineMoreThreeMonth",method = RequestMethod.GET)
    @CrossOrigin
    public MsgResult selectMoreThreeMonthProduct(){
        MsgResult msgResult1 = new MsgResult();
        List list = productService.findProductMoreThreeMonth();
        msgResult1.setCode(200);
        msgResult1.setMsg("查询pdcDeadline大于三个月的产品信息" + list);
        msgResult1.setData(list);
        log.info("查询定期时长大于三个月的产品");
        return msgResult1;
    }

    /**
     * 模糊查询
     * @param keyword
     * @return
     */
    @CrossOrigin
    @ApiOperation(value = "根据输入关键字查询产品")
    @RequestMapping(value = "/productFuzzySearchBykeyword",method = RequestMethod.GET)
    public MsgResult productFuzzySearchBykeywordFun(@RequestParam("keyword") String keyword){
        MsgResult msgResult = productService.productFuzzySearchBykeyword(keyword);
        Date date = new Date();
        log.info("=========根据关键字查询"+keyword);
        return msgResult;
    }
}
