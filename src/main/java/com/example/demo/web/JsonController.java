package com.example.demo.web;

import com.example.demo.json.DemoJson;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class JsonController {

    /**
     * 返回demo数据:
     * 请求地址：http://127.0.0.1:8080/demo/getDemo
     *
     * @return
     */
    @RequestMapping("/getDemo")
    public DemoJson getDemo() {
        DemoJson demo = new DemoJson();
        demo.setId(1);
        demo.setName("zf_test");
        return demo;
    }


}
