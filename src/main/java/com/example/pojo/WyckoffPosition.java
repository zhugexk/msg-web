package com.example.pojo;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@ToString
public class WyckoffPosition {
    @Id
    private Integer id;
    private List<WPInfo> wpList;

    @Data
    @ToString
    static class WPInfo {
        private String letter;
        private List<Position> positions;
        private MagneticPointGroup siteSymmetryGroup;
        private List<AtomicInsulatorVectors> aiVector;
        private List<ContentReduce> contentReduces;
    }

    @Data
    @ToString
    static class Position {
        private List<String> position;
        private List<String> spin;
        private Operation operation;
        @Data
        @ToString
        public static class Operation {
            private Boolean isTimeInversal;
            private String rotation;
            private List<String> translation;
        }
    }

    @Data
    @ToString
    public static class AtomicInsulatorVectors {
        private List<String> HSPWithRepNameArray;
        private List<List<Integer>> basisVectors;
        private String type;
    }

    @Data
    @ToString
    public static class ContentReduce {
        private String content;
        private List<Integer> reduce;
        private String type;
    }
}



