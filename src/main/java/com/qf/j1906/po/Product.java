package com.qf.j1906.po;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product implements Serializable {
    private Long pdcId;

    private String pdcName;

    private String pdcRisk;

    private String pdcDeadline;

    private Long pdcCode;

    private String pdcType;

    private Double pdcValue;

    private Integer pdcLevel;

    private Double pdcPrice;

    private Double pdcRate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date pdcDate;

    private Double pdcGain;

}