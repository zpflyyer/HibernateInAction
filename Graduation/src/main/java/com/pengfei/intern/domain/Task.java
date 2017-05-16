package com.pengfei.intern.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by zhaopen on 5/16/2017.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "task_tb")
public class Task implements Serializable{

    @Id @Column(name = "task_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "title",length = 50)
    private String title;
    @Column(name = "content",length = 500)
    private String content;
    @Column(name = "assign")
    private String assign_date;
    @Column(name = "deadline")
    private String deadline;

    @ManyToOne(targetEntity = Manager.class)
    @JoinColumn(name = "manager_id",nullable = false)
    private Manager manager;

    @OneToMany(targetEntity = Job.class,mappedBy = "task")
    private Set<Job> jobSet = new HashSet<>();

    public Task(String title,String content,String deadline){
        this.title = title;
        this.content = content;
        this.deadline = deadline;
    }

    public Task(String title,String content,String assign_date,String deadline){
       this(title,content,deadline);
        this.assign_date = assign_date;
    }
}
