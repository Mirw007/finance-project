package com.qf.j1906.po;

import lombok.Data;

/**
 * @Author: 刘旭
 * Date: 2019/12/6 15:51
 * @Version 1.0
 */
@Data
public class MsgResult {
    private int code;
    private String msg;
    private Object data;
}
