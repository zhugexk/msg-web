package com.example;

import com.example.pojo.MagneticSpaceGroup;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

@SpringBootTest
class MsgTestApplicationTests {
//    @Autowired
//    private MongoTemplate mongoTemplate;
//
//    @Test
//    void contextLoads() {
//        Criteria where = Criteria.where("groupName").is("1.1");
//        Query query = new Query(where);
//
//        MagneticSpaceGroup msg = mongoTemplate.findOne(query, MagneticSpaceGroup.class,
//                "msgWithBravaisLatticeAndIndHSP");
//        System.out.println(msg);
//    }

}
