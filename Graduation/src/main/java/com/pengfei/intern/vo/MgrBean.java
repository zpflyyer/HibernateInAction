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
    private String mgrName;
    private String mgrPass;
    private String mgrDept;
}
