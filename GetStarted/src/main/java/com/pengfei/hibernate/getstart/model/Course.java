package com.pengfei.hibernate.getstart.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by zhaopen on 3/13/2017.
 */
@Getter
@Setter
@Entity
@Table(name = "tb_cour")
public class Course {
    @Id
    private int cno;
    private String cname;
}
