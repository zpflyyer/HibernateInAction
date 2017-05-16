package com.pengfei.intern.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * Created by zhaopen on 5/16/2017.
 */
@Getter
@Setter
@NoArgsConstructor
public class TaskBean {
    private String title;
    private List<JobBean> jobBeanList;

    public TaskBean(String title){
        this.title = title;
    }
}
