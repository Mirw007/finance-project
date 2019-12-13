package com.qf.j1906.service;


import com.qf.j1906.po.MsgResult;
import com.qf.j1906.po.User;

public interface MemberService {
//    register
    public MsgResult register(String uName, String uTel, String uPassword, String verifyCode);
//    login
    public MsgResult login(String uName, String uPassword);
    //findMemberByName
    public MsgResult findMemberByName(String uName);
    //   edit
    public MsgResult editMember(User user);
    //delete
    public MsgResult delMember(String uName);
    public MsgResult getUserByName(String uName);

}
