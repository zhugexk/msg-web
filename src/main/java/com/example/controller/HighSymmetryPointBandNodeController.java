package com.example.controller;

import com.example.pojo.HighSymmetryPointBandNode;
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
public class HighSymmetryPointBandNodeController {
    @Autowired
    private MongoTemplate mongoTemplate;
    @RequestMapping("/getHSPBNbyId")
    public Result getHSPBNbyMSGId(Integer id) {
        Criteria where = Criteria.where("_id").is(id);
        Query query = new Query(where);
        HighSymmetryPointBandNode hspbn = mongoTemplate.findOne(query, HighSymmetryPointBandNode.class, "hspbn");

        return Result.success(hspbn);
    }
}
