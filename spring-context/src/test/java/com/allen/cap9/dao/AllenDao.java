package com.allen.cap9.dao;

/**
 * @author 周何圳 2020/4/18 新建
 * @description
 */

import org.springframework.stereotype.Repository;

@Repository
public class AllenDao {

    private String flag = "1";

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "AllenDao{" +
                "flag='" + flag + '\'' +
                '}';
    }
}
