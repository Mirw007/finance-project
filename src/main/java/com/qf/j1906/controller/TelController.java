package com.qf.j1906.controller;


import com.qf.j1906.po.MsgResult;
import com.qf.j1906.utils.SmsUtils;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController
public class TelController {

    @Autowired
    private RedisTemplate redisTemplate;
    @CrossOrigin
    @ApiOperation(value = "发送验证码")
    @RequestMapping(value = "/phoneCode",method = RequestMethod.POST)
    public Object sendphoneCode(@RequestParam("uTel")String uTel) {
        MsgResult msgResult=new MsgResult();
        try {
            String phoneSend = SmsUtils.sendSms(uTel);
            redisTemplate.opsForValue().set(uTel,phoneSend);
            msgResult.setMsg("验证码发送成功");
            msgResult.setData(phoneSend);
            return msgResult;
        } catch (Exception e) {
            msgResult.setMsg("验证码发送失败");
            return msgResult;
        }
    }
}
