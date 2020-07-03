package com.example.demo;

import com.example.demo.schedule.HelloJob;
import com.example.demo.util.QuartzManager;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@Slf4j
@SpringBootTest
class Demo01ApplicationTests {

    @Autowired
    private QuartzManager quartzManager;
    @Test
    public void mcreateTask() throws InterruptedException {
        quartzManager.addJob(HelloJob.class, "maoxs", "q1", "0/1 * * * * ?");
        log.info("添加任务成功");
        Thread.sleep(10000);
        quartzManager.pauseJob("maoxs", "q1");
        log.info("暂停任务成功");
        Thread.sleep(2000);
        log.info("=============查询任务================");
        List<Map<String, Object>> maps = quartzManager.queryAllJob();
        System.out.println(Collections.unmodifiableCollection(maps));
        while (true) ;
    }

}
