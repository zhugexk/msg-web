package com.example.pojo;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import java.util.List;
import java.util.Objects;

@Data
@ToString
public class HighSymmetryPointBandNode {
    @Id
    private Integer id;
    private List<HSPBN> hspbn;

    @Data
    @ToString
    public static class HSPBN {
        private List<EqualHighSymmetryPoint> equalHSPs;
        private IndenpendentHighSymmetryPoint indHSP;
        private List<KDotP> kdotp;
        private List<HighSymmetryLine> hsls;
    }

    @Data
    @ToString
    public static class HighSymmetryLine {
        private List<Object> direction;
        private List<LowerSymmetryInfo> lowerSymInfos;
    }

    @Data
    @ToString
    public static class LowerSymmetryInfo {
        private String repName;
        private List<String> repBases;
        private List<String> subgroupBases;
        private List<List<String>> transformMat;
        private String type;
    }

    @Data
    @ToString
    public static class KDotP {
        private String repName;
        private List<List<String>> mat;
        private String type;
    }
    @Data
    @ToString
    public static class EqualHighSymmetryPoint {
        private String name;
        private List<String> position;
        private String operation;
    }
    @Data
    @ToString
    public static class IndenpendentHighSymmetryPoint {
        private String name;
        private List<String> position;
        private List<String> operations;
        private List<GroupRepresentation> representations;
    }
}


