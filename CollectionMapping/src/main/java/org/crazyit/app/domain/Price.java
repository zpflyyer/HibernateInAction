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
public class Price {
    private String price_ch;
    private String price_en;
    @Parent
    private Person person;
}
