package com.example.controller;

import com.example.pojo.LittleGroup;
import com.example.pojo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class LittleGroupController {
    @Autowired
    private MongoTemplate mongoTemplate;
    @RequestMapping("/getAllLittleGroupsByMSGId")
    public Result getAllLittleGroupsByMSGId(Integer msgId) {
        Criteria where = Criteria.where("msgId").is(msgId);
        Query query = new Query(where);
        List<LittleGroup> littleGroups = mongoTemplate.find(query, LittleGroup.class, "lg");
        System.out.println(littleGroups);
        return Result.success(littleGroups);
    }
}
