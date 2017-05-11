package com.pengfei.intern.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by zhaopen on 5/11/2017.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CheckBackBean {
    private boolean granted;
    private String reason;
}
