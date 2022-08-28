package com.example.mongodbtest.dao;

import com.example.mongodbtest.entity.Param1;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author kangchen
 * @date 2022/8/28 15:04
 */
public interface ParamDao extends MongoRepository<Param1, Long> {

}
