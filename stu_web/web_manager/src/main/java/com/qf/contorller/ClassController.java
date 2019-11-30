package com.qf.contorller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qf.ClassInfo;
import com.qf.IClassService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("class")
public class ClassController {

    @Reference
    private IClassService classService;

    @RequestMapping("toClassList")
    public  String toClassList(Model model){
        List<ClassInfo> list = classService.list();
        model.addAttribute("classlist",list);
        System.out.println("班级数量："+list.size());
        return "class_info/classinfolist";
    }
}
