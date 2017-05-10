package com.pengfei.HibernateQuery.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by zhaopen on 4/21/2017.
 */
@Getter
@Setter
@ToString
@Entity
@Table(name = "tb_ID")
public class IdentifyCard {
    @Id
    private String id_number;
    private String country;
    private Date valid_period;
}
