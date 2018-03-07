package com.sysco.lambdatest.dao;

import com.sysco.lambdatest.entities.Item;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ItemDao {

//    @Autowired
    JdbcTemplate jdbcTemplate=new JdbcTemplate();


    public int addItem(Item item){return 1;
//        String sql = "INSERT INTO item (name, category, vendor, stock)"
//                + " VALUES (?, ?, ?, ?)";
//        return jdbcTemplate.update(sql,new Object[]{ item.getName(), item.getCategory(), item.getVendor(), item.getStock()});
    }


    public String selectItem(int id){
return "d";
//        String sql = "Select name FROM item where id=?";
//        return (String) this.jdbcTemplate.queryForObject(sql,new Object[]{id},String.class);
    }




}
