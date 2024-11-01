package com.example.controller;

import com.example.pojo.MagneticPointGroup;
import com.example.pojo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class MagneticPointGroupController {
    @Autowired
    private MongoTemplate mongoTemplate;
    @RequestMapping("/getMPGById")
    public Result getMPGById(Integer id) {
        Criteria where = Criteria.where("_id").is(id);
        Query query = new Query(where);
        MagneticPointGroup mpg = mongoTemplate.findOne(query, MagneticPointGroup.class, "mpg");
        assert mpg != null;
        return Result.success(mpg);
    }
}
