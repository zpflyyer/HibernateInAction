package com.pengfei.hibernate.getstart.model;

import lombok.*;
import org.hibernate.Session;
import org.hibernate.annotations.Formula;

import javax.persistence.*;

/**
 * Created by zhaopen on 3/13/2017.
 */
@Getter
@Setter
@Entity
@Table(name = "tb_stu",uniqueConstraints = @UniqueConstraint(columnNames = {"sno"}))
public class Student {
    @Id
     private int sno;
     private String sname;

    @Enumerated(EnumType.STRING)
    private Season bir_season;

    @Formula(value = "(select convert(varchar(225),sno)+sname from tb_stu  where tb_stu.sno = sno)")
    private String stu_inf;
}
