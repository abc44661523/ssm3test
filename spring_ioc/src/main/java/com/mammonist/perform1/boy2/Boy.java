package com.mammonist.perform1.boy2;

import com.mammonist.perform1.boy1.Girl;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@ToString
@NoArgsConstructor
@Component
public class Boy {
    @Autowired @Value("老李")
    private String name;
    @Autowired @Qualifier("japanGirl")
    private Girl girl;

    public Boy(String name, Girl girl) {
        this.name = name;
        this.girl = girl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Girl getGirl() {
        return girl;
    }

    public void setGirl(Girl girl) {
        this.girl = girl;
    }
}
