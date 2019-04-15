package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Repository
public class ItemRepository {

    @Autowired
    JdbcTemplate template;

    /*Getting all Items from table*/
    public List<Task> getAllTask(){
        List<Task> task = template.query("select id, name,category from Task",(result,rowNum)->new Task(result.getInt("id"),
                result.getString("name"),result.getString("category"),result.getString("PRIORITY")));
        return task;
    }
    
    public Task getTask(String Priority){
        String query = "SELECT * FROM Task WHERE Priority=?";
       Task task = template.queryForObject(query,new Object[]{Priority},new BeanPropertyRowMapper<>(Task.class));

        return task;
    }
    
    public int addTask(int id,String name,String category,String Priority){
        String query = "INSERT INTO Task VALUES(?,?,?,?)";
        return template.update(query,id,name,category,Priority);
    }
    /*delete an item from database*/
    public int deleteTask(String category){
        String query = "DELETE FROM Task WHERE category =?";
        return template.update(query,category);
    }
}
