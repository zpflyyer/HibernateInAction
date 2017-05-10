package org.crazyit.app.domain;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Parent;

import javax.persistence.*;
import java.util.Map;

/**
 * Created by zhaopen on 4/20/2017.
 */
@Getter
@Setter
@Embeddable
public class Relativity {
    @Parent
    private Person owner;

    @Column(name = "rela_name")
    private String name;

    @Column(name = "rela_age")
    private Integer age;

    @ElementCollection(targetClass = String.class)
    @CollectionTable(name = "rela_inf",joinColumns = @JoinColumn(
            name = "owner_id",nullable = false))
    @MapKeyColumn(name = "info")
    @MapKeyClass(String.class)
    @Column(name = "detail")
    private Map<String,String> rela_inf;//

}
