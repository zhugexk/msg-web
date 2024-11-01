package com.example.controller;

import com.example.pojo.MagneticSpaceGroup;
import com.example.pojo.PointGroupOperation;
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
public class MagneticSpaceGroupController {
    @Autowired
    private MongoTemplate mongoTemplate;

    @RequestMapping("/getMSGByGroupName")
    public Result getMSGByTypeAndGroupName(String groupName) {
        Criteria where = Criteria.where("groupName").is(groupName);
        Query query = new Query(where);
        MagneticSpaceGroup msg = mongoTemplate.findOne(query, MagneticSpaceGroup.class,
                "msg");
        assert msg != null;
        for (MagneticSpaceGroup.MagneticSpaceGroupOperation operation : msg.getOperations()) {
            where = Criteria.where("name").is(operation.getRotation());
            query = new Query(where);
            PointGroupOperation pgOperation = mongoTemplate.findOne(query, PointGroupOperation.class, "pg");
            operation.setPointGroupOperation(pgOperation);
        }
        return Result.success(msg);
    }
}
