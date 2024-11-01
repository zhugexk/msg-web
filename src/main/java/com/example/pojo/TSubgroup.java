package com.example.pojo;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import java.sql.ClientInfoStatus;
import java.util.List;

@Data
@ToString
public class TSubgroup {
    private Integer index;
    private List<TSubgroupOperation> operations;
    private List<String> delta;
    private List<List<String>> P;
    private String groupType;
    private String groupName;
    private List<AIVector> aiVectors;
    @Data
    @ToString
    public static class TSubgroupOperation {
        private String rotation;
        private Boolean isTimeInversal;
    }

    @Data
    @ToString
    public static class AIVector {
        private List<String> subgroupHSPWithRepNameArray;
        private List<List<Integer>> P;
        private List<String> HSPWithRepNameArray;
        private String type;
    }
}

