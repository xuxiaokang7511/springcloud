package com.consumer.controller;

import com.api.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptConsumerController {


    @Autowired
    private RestTemplate restTemplate;

    /**
     * 提供者 URL 的前缀
     */
    private static final String REST_URL_PREFIX = "http://localhost:8081";

    /**
     * 需要去提供者那里获取服务
     * @param id
     * @return
     */
    @RequestMapping("/consumer/queryDeptById/{id}")
    public Dept getDeptById(@PathVariable("id")Long id){
        // 去提供者那里，通过 Get 请求获取一个对象
        // getForObject 的参数：提供者地址；【请求所需的参数】 ； 返回值对象的类
        // 请求需要传递的参数；
        //          1. 通过URL拼接；
        //          2. 使用 Map 传参 ；
        //          3. 直接传递参数对象（就像下面的 Add 方法）
        return restTemplate.getForObject(REST_URL_PREFIX+"/queryDeptById/"+id,Dept.class);
    }

    @RequestMapping("/consumer/getDepts")
    public List<Dept> getDepts(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/queryDepts",List.class);
    }

    @RequestMapping("/consumer/addDept")
    public Boolean addDept(Dept dept){
        return restTemplate.postForObject(REST_URL_PREFIX+"/addDept",dept,Boolean.class);
    }
}
