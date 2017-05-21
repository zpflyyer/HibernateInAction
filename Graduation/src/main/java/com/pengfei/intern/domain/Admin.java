package com.pengfei.intern.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by zhaopen on 5/19/2017.
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "intern_tb")
@DiscriminatorColumn(name="emp_type"
        , discriminatorType=DiscriminatorType.INTEGER)
@DiscriminatorValue(value="0")
public class Admin implements Serializable{
    private static final long serialVersionUID = 48L;

    @JsonBackReference
    @Id @Column(name="emp_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    // 标识属性
    private Integer id;
    // 管理员登录名
    @Column(name="emp_name", nullable=false, length=50 , unique=true)
    private String name;
    // 管理员姓名
    @Column(name="emp_real_name", nullable=false, length=50 , unique=true)
    private String real_name;
    // 管理员密码
    @Column(name="emp_pass", nullable=false, length=50)
    private String pass;

    @Column(name="emp_mail", length=50)
    private String email;

    @Column(name="emp_board", length=50)
    private Date board;

    @Column(name="emp_tel", length=50)
    private String tel;

    @Column(name="emp_id_num", length=50)
    private String id_num;

    // 根据name、pass来重写hashCode()方法
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((pass == null) ? 0 : pass.hashCode());
        return result;
    }
    // 根据name、pass来重写equals()方法，只要name、pass相同的员工即认为相等。
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Admin other = (Admin) obj;
        if (name == null)
        {
            if (other.name != null) return false;
        }
        else if (!name.equals(other.name)) return false;
        if (pass == null)
        {
            if (other.pass != null) return false;
        }
        else if (!pass.equals(other.pass)) return false;
        return true;
    }

    @Override
    public String toString(){
        return "name:" + name + "pass:" + pass;
    }
}
