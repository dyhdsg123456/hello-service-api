package com.springcloud.helloserviceapi;

import com.springcloud.helloserviceapi.dto.User;
import org.springframework.web.bind.annotation.*;

/**
 * Author: dyh
 * Date:   2019/7/17
 * Description:
 */
@RequestMapping("refactor")
public interface HelloService {
    @RequestMapping("hello4")
    String hello(@RequestParam("name") String name);

    @RequestMapping("hello5")
    User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    @RequestMapping(value = "hello6",method = RequestMethod.POST)
    String hello(@RequestBody User user);
}
