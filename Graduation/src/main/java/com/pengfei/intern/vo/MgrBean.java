package com.pengfei.intern.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by zhaopen on 5/19/2017.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MgrBean {
    private static final long serialVersionUID = 48L;
    private int id;
    private String real_name;
    private String empName;
    private String empPass;
    private String tel;
    private String email;
    private String dept;
}
