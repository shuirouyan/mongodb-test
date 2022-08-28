package com.example.mongodbtest.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author kangchen
 * @date 2022/8/28 14:19
 */
@Data
public class Param1 implements Serializable {
    private static final long serialVersionUID = 5284483523295294080L;
    private Long id;
    private String noSerial;
    private String name;
    private String description;
    private Date createTime;
}
