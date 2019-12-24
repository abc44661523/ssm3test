package com.mammonist.perform1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PerformImpl implements Perform {

    @Override
    public void perform() {
        log.info("二人转");
    }

    @Override
    public int sing(int i,int j) {
        log.info("唱歌");
        return i + j;
    }
}
