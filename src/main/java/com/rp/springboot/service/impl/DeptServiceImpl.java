package com.rp.springboot.service.impl;

import com.rp.springboot.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by rp on 2018/9/13.
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    public JdbcTemplate jdbcTemplate;

    @Override
    public int createDept(int id, String name) {
        int update = jdbcTemplate.update("insert into department values(?,?);", id, name);
        return update;
    }
}
