package com.example.controller;

import com.example.pojo.Result;
import com.example.pojo.TSubgroup;
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
public class TSubgroupController {
    @Autowired
    private MongoTemplate mongoTemplate;

    @RequestMapping("/getTSubgroupById")
    public Result getTSubgroupById(Integer id) {
        Criteria where = Criteria.where("_id").is(id);
        Query query = new Query(where);
        TSubgroups tsubgroups = mongoTemplate.findOne(query, TSubgroups.class, "tsubgroup");
        assert tsubgroups != null;
        return Result.success(tsubgroups);
    }

    @Data
    @ToString
    private static class TSubgroups {
        @Id
        private Integer id;
        private List<TSubgroup> tsubgroups;
    }
}
