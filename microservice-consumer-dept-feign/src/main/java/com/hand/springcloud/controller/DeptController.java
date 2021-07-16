package com.hand.springcloud.controller;

import com.hand.china.springcloud.entities.Dept;
import com.hand.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptController {
    @Autowired
    private DeptClientService deptClientService;

    @GetMapping("/list")
    public List<Dept> list() {
        return deptClientService.list();
    }

    @GetMapping("/{deptId}")
    public Dept queryDetail(@PathVariable Long deptId){
        return deptClientService.get(deptId);
    }

}
