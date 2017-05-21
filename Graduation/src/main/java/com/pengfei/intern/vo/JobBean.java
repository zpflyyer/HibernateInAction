package com.pengfei.intern.vo;

import com.pengfei.intern.domain.Intern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by zhaopen on 5/16/2017.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class JobBean {
    private int job_id;
    private int grade;
    private boolean finished;

    private String task_title;
    private String task_content;
    private String assign_date;
    private String deadline;

    private String intern;

    public JobBean(String task_title,int job_id,int grade,boolean finished,String intern){
        this.task_title = task_title;
        this.job_id = job_id;
        this.grade = grade;
        this.finished = finished;
        this.intern = intern;
    }
}
