package com.example.pojo;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString

public class GroupRepresentation {
    private String name;
    private List<String> characters;
    private List<List<List<String>>> repMats;
    private String type;
}
