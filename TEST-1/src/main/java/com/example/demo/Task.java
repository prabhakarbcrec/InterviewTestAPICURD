package com.example.demo;

import java.sql.Timestamp;

import javax.persistence.Entity;

public class Task {
	    private int id;
	    private String name;
	    private String category;
	    private String Priority;
     
	 
        public Task() {
	    }

	    public Task(int id, String name, String category,String Priority) {
	        this.id = id;
	        this.name = name;
	        this.category = category;
	        this.Priority=Priority;
	       
	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getPriority() {
	        return Priority;
	    }

	    public void setPriority(String Priority) {
	        this.Priority = Priority;
	    }
	    public String getCategory() {
	        return category;
	    }

	    public void setCategory(String category) {
	        this.Priority = Priority;
	    }
	    
	  

}
