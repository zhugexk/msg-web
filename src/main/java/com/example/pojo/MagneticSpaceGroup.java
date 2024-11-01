package com.example.pojo;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@ToString
@Document("msg")
public class MagneticSpaceGroup {
    @Id
    private Integer id;
    private String type;
    private String groupName;
    private BravaisLattice bravaisLattice;
    private List<MagneticSpaceGroupOperation> operations;
    private List<AIBasis> aiBases;

    @Data
    @ToString
    public static class MagneticSpaceGroupOperation {
        private String rotation;
        private List<String> translation;
        private Boolean isTimeInversal;
        private PointGroupOperation pointGroupOperation;
    }
    @Data
    @ToString
    public static class AIBasis {
        private List<String> HSPWithRepNameArray;
        private List<List<Integer>> basisVectors;
        private String type;
    }

    @Data
    @ToString
    public static class BravaisLattice {
        private String name;
        private List<List<String>> conventionalBasicVectors;
        private List<List<String>> primitiveBasicVectors;
    }
}

