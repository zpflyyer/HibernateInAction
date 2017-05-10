package com.pengfei.uni_irectional.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by zhaopen on 4/21/2017.
 */
@Getter
@Setter
@Entity
@Table(name = "tb_ID")
public class IdentifyCard {
    @Id
    private String id_number;
    private String country;
    private Date valid_period;
}
