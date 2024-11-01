package com.example.controller;

import com.example.pojo.PointGroupOperation;
import com.example.pojo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class PointGroupController {
    @Autowired
    private MongoTemplate mongoTemplate;

    @RequestMapping("/getPointGroups")
    public Result getPointGroupOperatinos() {
        Query query = new Query();
        List<PointGroupOperation> pgOperations = mongoTemplate.find(query, PointGroupOperation.class,
                "pg");
        return Result.success(pgOperations);
    }
}
