package com.xbj.shardingjdbc.entity;


import lombok.Builder;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Builder
@Table(name = "student")
public class Student {
    private Integer id;
    private String name;
    private Integer age;
    private Integer weight;
}
