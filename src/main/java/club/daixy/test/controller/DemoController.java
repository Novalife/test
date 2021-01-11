package club.daixy.test.controller;

import club.daixy.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author daixiaoyong
 * @date 2021/1/7 19:50
 * @description 测试控制器
 */

@RestController
@RequestMapping(value = "/client")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping("/say")
    public String sayWhat() {
        return demoService.say();
    }
}