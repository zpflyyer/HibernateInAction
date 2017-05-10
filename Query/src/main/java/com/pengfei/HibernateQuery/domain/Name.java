package com.pengfei.HibernateQuery.domain;

import lombok.*;

import java.io.Serializable;

/**
 * Created by zhaopen on 4/21/2017.
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Name implements Serializable{
    private String first_name;
    private String last_name;

    @Override
    public boolean equals(Object object){
        if (object == this){
            return true;
        }
        if (object != null && object.getClass() == Name.class){
            Name name = (Name)object;
            return name.getFirst_name().equals(getFirst_name())
                    && name.getLast_name().equals(getLast_name());
        }
        return false;
    }

    @Override
    public int hashCode(){
        return getFirst_name().hashCode() * 31 + getLast_name().hashCode();
    }
}
