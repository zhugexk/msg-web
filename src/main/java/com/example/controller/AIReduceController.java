package com.example.controller;

import com.example.pojo.AIReduce;
import com.example.pojo.HighSymmetryPointBandNode;
import com.example.pojo.Result;
import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class AIReduceController {
    @Autowired
    private MongoTemplate mongoTemplate;

    @RequestMapping("/getAIReducesbymsgId")
    public Result getAIReducesbymsgId(Integer id) {
        Criteria where = Criteria.where("_id").is(id);
        Query query = new Query(where);
        AIReduceList aiReduceList = mongoTemplate.findOne(query, AIReduceList.class, "aired");

        return Result.success(aiReduceList.AIReduces);
    }

    @Data
    @ToString
    class AIReduceList {
        @Id
        private Integer id;
        private List<AIReduce> AIReduces;
    }
}
