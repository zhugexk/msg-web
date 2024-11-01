package com.example.pojo;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@ToString
public class MagneticPointGroup {
    @Id
    private Integer id;
    private String name;
    private List<String> operations;
    private List<GroupRepresentation> representations;
    private String type;
    private List<OrbitalReduce> orbitalReduces;

    @Data
    @ToString
    public static class OrbitalReduce {
        private String orbitalName;
        private List<String> orbitalBases;
        private List<RepresentationInfo> repInfo;
        private List<List<String>> transformMat;
        private String type;
        @Data
        @ToString
        public static class RepresentationInfo {
            private String repName;
            private Integer repBasisIndex;
            private Integer repIndex;
        }
    }
}
