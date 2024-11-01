package com.example.pojo;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@ToString
public class LittleGroup {
    @Id
    private String id;
    private Integer msgId;
    private Integer kpointType;
    private Integer corRepFlag;
    private String msgType;
    private String msgName;
    private String kpointName;
    private List<String> coordinateByVariable;
    private List<Object> coordinateByPoint;
    private List<String> singleIrreps;
    private List<String> doubleIrreps;
    private List<Operation> operations;
    private Operation timeReverseOperation;
    private List<Representation> representations;
    private Bilbao bilbao;

    @Data
    @ToString
    public static class Operation {
        private String rotation;
        private List<String> translation;
    }
    @Data
    @ToString
    public static class Representation {
        private String repName;
        private String repType;
        private List<List<List<String>>> repMats;
        private List<List<String>> timeReverseRepMat;
        private String bilbaoRepName;
    }
    @Data
    @ToString
    public static class Bilbao {
        private String msgType;
        private String msgName;
        private Integer flag;
        private String kpoint;
        private List<String> coordinate;
        private List<String> singleIrreps;
        private List<String> doubleIrreps;
        private Transform transform;
    }
    @Data
    @ToString
    public static class Transform {
        private List<List<String>> p1;
        private List<String> tau;
        private List<List<String>> p2;
        private List<List<String>> p3;
    }
}
