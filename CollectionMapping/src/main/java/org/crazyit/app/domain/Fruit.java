package org.crazyit.app.domain;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Parent;

import javax.persistence.Embeddable;

/**
 * Created by zhaopen on 4/21/2017.
 */
@Getter
@Setter
@Embeddable
public class Fruit {
    private String name_ch;
    private String name_en;
    @Parent
    private Person person;

    @Override
    public boolean equals(Object obj){
        if(obj == this){
            return true;
        }
        if(obj != null && obj.getClass() == Fruit.class){
            Fruit fruit = (Fruit)obj;
            return fruit.getName_ch().equals(this.getName_ch())
                    &&fruit.getName_en().equals(this.getName_en());
        }
        return false;
    }

    @Override
    public int hashCode(){
        return this.getName_en().hashCode()*31 + this.getName_ch().hashCode();
    }
}
