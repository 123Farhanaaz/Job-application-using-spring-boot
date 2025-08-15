package com.alsocraxy.spring_boot_rest;


import com.alsocraxy.spring_boot_rest.model.JobPost;
import com.alsocraxy.spring_boot_rest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Controller
@RestController
public class JobRestController { //this is the  controller

    @Autowired
    private JobService service;

    @GetMapping({"jobPosts", "/"})
//    @ResponseBody
    public List<JobPost> getalljobs(){
        return service.getAllJobs();
    }
}
