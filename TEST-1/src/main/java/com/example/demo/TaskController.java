package com.example.demo;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {
	
	
	    @Autowired
	    ItemRepository itemRepo;

	    @RequestMapping(value="/getAllTask", method = RequestMethod.GET)
	    @ResponseBody
	    public List<Task> getAllTask(){
	        return itemRepo.getAllTask();
	    }

	    @RequestMapping("/getTask")
	    @ResponseBody
	    public Task getTask(@RequestParam("Priority") String Priority){
	        return itemRepo.getTask(Priority);
	    }

	    @RequestMapping("/addTask")
	    @ResponseBody
	    public String addItem(@RequestParam("id") int id,@RequestParam("name") String name,
	                          @RequestParam("category") String category,@RequestParam("Priority") String Priority){
	        if(itemRepo.addTask(id,name,category,Priority) >= 1){
	            return "Task Added Successfully";
	        }else{
	            return "Something went wrong !";
	        }
	    }
	    @RequestMapping("/deteteTask")
	    @ResponseBody
	    public String deteteItem(@RequestParam("category") String category){
	        if(itemRepo.deleteTask(category) >= 1){
	            return "Task Deleted Successfully";
	        }else{
	            return "Something went wrong !";
	        }
	    }
}
