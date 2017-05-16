package com.pengfei.intern.vo.form_vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by zhaopen on 5/16/2017.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Task_vo {
    String title;
    String content;
    String deadline;
    String[] internList;
}
