package com.example.pojo;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@ToString
public class PointGroupOperation {
    @Id
    private String id;
    private String name;
    private List<String> axis;
    private Integer det;
    private String angle;
}
