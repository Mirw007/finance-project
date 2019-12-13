package com.qf.j1906.service.impl;


import com.qf.j1906.mapper.UserMapper;
import com.qf.j1906.po.MsgResult;
import com.qf.j1906.po.User;
import com.qf.j1906.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RedisTemplate redisTemplate;

    //rgister
    @Override
    public MsgResult register(String uName, String uTel, String uPassword, String verifyCode) {
        //将验证码写入Redis中
        //从redis中获取验证码
        String code = (String) redisTemplate.opsForValue().get(uTel);
        MsgResult msgResult = new MsgResult();
        if (code.equals(verifyCode)) {
            boolean b = userMapper.register(uName, uTel, uPassword);
            if (b) {
                msgResult.setCode(200);
                msgResult.setMsg("注册成功");
                msgResult.setData(code);
                return msgResult;
            }
            msgResult.setMsg("验证码错误");
            return msgResult;
        }
        msgResult.setMsg("注册失败");
        return msgResult;
    }

    //login
    @Override
    public MsgResult login(String uName, String uPassword) {
        User login = userMapper.login(uName);
        MsgResult msgResult = new MsgResult();
        if (login == null) {
            msgResult.setMsg("用户不存在");
        } else if (login.getUPassword().equals(uPassword)) {
            msgResult.setMsg("登录成功");
            msgResult.setCode(200);
            msgResult.setData(login);
        } else {
            msgResult.setMsg("登录失败");
        }
        return msgResult;
    }


    @Override
    public MsgResult findMemberByName(String uName) {
        User memberByName = userMapper.findMemberByName(uName);
        MsgResult msgResult = new MsgResult();
        msgResult.setData(memberByName);
        msgResult.setMsg("查询ok");
        msgResult.setCode(200);
        return msgResult;
    }

    @Override
    public MsgResult editMember(User user) {
        boolean member = userMapper.editMember(user);
        MsgResult msgResult = new MsgResult();
        if (member == true) {
            msgResult.setCode(200);
            msgResult.setMsg("修改成功");
            msgResult.setData(member);
            return msgResult;
        }
        msgResult.setMsg("修改失败");
        return msgResult;
    }

    @Override
    public MsgResult delMember(String uName) {
        boolean b = userMapper.delMember(uName);
        MsgResult msgResult = new MsgResult();
        if (b == true) {
            msgResult.setCode(200);
            msgResult.setMsg("删除成功");
            return msgResult;
        }
        msgResult.setMsg("删除失败");
        return msgResult;
    }

    @Override
    public MsgResult getUserByName(String uName) {
        User user = userMapper.getUserByName(uName);
        MsgResult msgResult = new MsgResult();
        msgResult.setCode(200);
        msgResult.setMsg("success");
        msgResult.setData(user);
        return msgResult;
    }
}


