package com.pengfei.intern.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
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
@Table(name = "job_tb")
public class Job {
    @Id
    @Column(name = "job_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "grade",length = 50)
    private int grade;

    @Column(name = "finished",length = 500)
    private boolean finished;

    @Column(name = "accepted")
    private String accepted;

    @Column(name = "accept_date")
    private String accept_date;

    @ManyToOne(targetEntity = Task.class)
    @JoinColumn(name = "task_id",nullable = false)
    private Task task;

    @ManyToOne(targetEntity = Intern.class)
    @JoinColumn(name = "intern_id",nullable = false)
    private Intern intern;

    public Job(Task task,Intern intern,int grade,boolean finished,String accepted,String accept_date){
        this.task = task;
        this.intern = intern;
        this.grade = grade;
        this.finished = finished;
        this.accepted = accepted;
        this.accept_date = accept_date;
    }
}
