package com.example.pojo;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class AIReduce {
    private Integer msgId;
    private String repType;
    private String hspName;
    private String wpName;
    private List<String> AIBases;
    private List<String> hspBases;
    private List<List<String>> reduceMat;
    private String siteSymRepName;
}
