package com.pengfei.hibernate.getstart.model;

import lombok.*;
import org.hibernate.annotations.Formula;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by zhaopen on 3/13/2017.
 */
@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table(name = "tb_sc")
public class Score implements Serializable{
    @Id
    private int sno;
    @Id
    private int cno;
    private int score;
    @Formula(value = "(select sname+'\t'+cname+'\t'+score from tb_stu, tb_cour, tb_score where tb_score.sno = sno and tb_score.cno = cno" +
            "and tb_stu.sno = tb_score.sno and tb_score.cno = tb_cour.cno)")
    private String score_inf;
}
