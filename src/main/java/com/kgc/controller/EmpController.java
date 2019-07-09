package com.kgc.controller;

import com.github.pagehelper.PageInfo;
import com.kgc.entity.Dept;
import com.kgc.entity.Emp;
import com.kgc.service.DeptService;
import com.kgc.service.EmpService;
import com.kgc.utils.EmpParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/")
public class EmpController {
    @Autowired
    private EmpService empService;
    @Autowired
    private DeptService deptService;

    @RequestMapping("/index")
    public String index(@RequestParam(value = "pageIndex",defaultValue = "1") Integer pageIndex,
                        @RequestParam(value = "pageSize",defaultValue = "3") Integer pageSize,
                        EmpParam empParam,
                        Model model){
        PageInfo<Emp> info = empService.getEmpListByPage(pageIndex,pageSize,empParam);
        List<Dept> deptList=deptService.getDeptList();
        model.addAttribute("empParam",empParam);
        model.addAttribute("info",info);
        model.addAttribute("deptList",deptList);
        return "index";
    }

    @RequestMapping
}
