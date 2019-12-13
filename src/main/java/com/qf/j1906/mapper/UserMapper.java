package com.qf.j1906.mapper;


import com.qf.j1906.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    //    register
    public boolean register(String uName, String uTel, String uPassword);
    //    login
    public User login(String uName);
    //findMemberByName
    public User findMemberByName(String uName);
    //   edit
    public boolean editMember(User user);
    //delete
    public boolean delMember(String uName);

    public User getUserByName(String uName);
}