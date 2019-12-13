package com.qf.j1906.controller;


import com.qf.j1906.po.MsgResult;
import com.qf.j1906.po.User;
import com.qf.j1906.service.impl.MemberServiceImpl;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class MemberController {


    @Autowired
    private MemberServiceImpl memberService;
    //注册
    @CrossOrigin
    @ApiOperation(value = "注册")
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public MsgResult register(@RequestParam("uName") String uName,
                              @RequestParam("uTel") String uTel,
                              @RequestParam("uPassword") String uPassword,
                              @RequestParam("verifyCode") String verifyCode) {
        MsgResult msgResult = new MsgResult();
        MsgResult register = memberService.register(uName, uTel, uPassword, verifyCode);
        log.info("===============注册");
        return register;
    }
    //登录
    @CrossOrigin
    @ApiOperation(value = "登录")
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public MsgResult login(String uName, String uPassword) {
        MsgResult login = memberService.login(uName, uPassword);
        log.info("+++++++++++++登录");
        return login;
    }
    //查询ByName
    @CrossOrigin
    @RequestMapping(value = "/findMemberByName",method = RequestMethod.GET)
    public MsgResult findMemberByName(String uName){
        MsgResult memberByName = memberService.findMemberByName(uName);
        return memberByName;
    }

    //修改
    @CrossOrigin
    @RequestMapping(value = "/editMember",method = RequestMethod.POST)
    public MsgResult editMember(User user){
        MsgResult editMember = memberService.editMember(user);
        log.info("________修改用户信息");
        return editMember;
    }
    //注销账号
    @CrossOrigin
    @ApiOperation(value = "根据用户名(uName)删除账号")
    @RequestMapping(value = "/delMember", method = RequestMethod.POST)
    public MsgResult delMember(String uName) {
        MsgResult delMember = memberService.delMember(uName);
        log.info("________删除账号");
        return delMember;
    }
}
