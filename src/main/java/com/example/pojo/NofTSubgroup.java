package com.example.pojo;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@ToString
public class NofTSubgroup {
    @Id
    private Integer id;
    private List<List<NofTSubgroupInfo>> data;
}
