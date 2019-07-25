package com.xbj.shardingjdbc.controller;

import com.xbj.shardingjdbc.entity.Student;
import com.xbj.shardingjdbc.mapper.StudentMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Random;

@RestController
public class TestController {
    @Resource
    private StudentMapper studentMapper;
    @GetMapping("test")
    public String test(){
        for(int i =0;i<100;i++){
            studentMapper.insert(Student.builder().id(i).name("test"+i).age(i+new Random().nextInt(40000)).weight(i+new Random().nextInt(40000)).build());
        }
        return "success";
    }


    @GetMapping("select")
    public String select(){
        return studentMapper.selectAll().toString();
//    return "";
    }


}
