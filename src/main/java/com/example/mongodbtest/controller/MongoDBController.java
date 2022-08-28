package com.example.mongodbtest.controller;

import com.example.mongodbtest.dao.ParamDao;
import com.example.mongodbtest.entity.Param1;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kangchen
 * @date 2022/8/28 14:17
 */
@RestController
@Slf4j
public class MongoDBController {
    @Autowired
    private MongoTemplate mongoTemplate;
    @Autowired
    private ParamDao paramDao;

    @GetMapping("/save")
    public Map<String, Object> saveEntityMethod(Param1 param) {
        Gson gson = new Gson();
        String saveParam = gson.toJson(param);
        log.info("saveParam:{}", saveParam);
        Param1 save = paramDao.save(param);
        Map<String, Object> map = new HashMap<>();
        map.put("data", save);
        map.put("status", HttpStatus.OK);
        return map;
    }
}
