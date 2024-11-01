package com.example.controller;

import com.example.pojo.Result;
import com.example.pojo.WyckoffPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class WyckoffPositionController {
    @Autowired
    private MongoTemplate mongoTemplate;
    @RequestMapping("getWyckoffPositionById")
    public Result getWyckoffPositionByMSGId(Integer id) {
        Criteria where = Criteria.where("_id").is(id);
        Query query = new Query(where);
        WyckoffPosition wp = mongoTemplate.findOne(query, WyckoffPosition.class,
                "wyckoffposition");
        return Result.success(wp);
    }
}
