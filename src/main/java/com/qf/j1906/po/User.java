package com.qf.j1906.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User implements Serializable {
    private Integer uId;
    private String uTel;
    private String uPassword;
    private String uName;
    private String uEmail;
    private String uAddress;
    private String uCard;
    private String uBank;
}
