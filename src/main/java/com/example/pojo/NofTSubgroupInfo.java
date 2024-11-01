package com.example.pojo;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class NofTSubgroupInfo {
    private List<String> subgroupHSPWithRepNameArray;
    private List<List<Integer>> P;
    private List<String> HSPWithRepNameArray;
    private String type;
}
