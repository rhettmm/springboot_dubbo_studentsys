package com.qf.contorller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qf.ClassInfo;
import com.qf.IClassService;
import com.qf.IStuService;
import com.qf.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebParam;
import javax.lang.model.element.VariableElement;
import java.util.List;

@Controller
@RequestMapping("/stu")
public class StuController {

    @Reference
    private IStuService stuService;
    @Reference
    private IClassService classService;

    /**
     * 查询所有学生信息
     * @param model
     * @return
     */
    @RequestMapping("toStuList")
    public String toStuList(Model model){
        List<Student> list = stuService.list();
        //根据班级id查询班级信息
        for (Student stu:list) {
            Integer cid = stu.getCid();
            ClassInfo classInfo=classService.selectClassById(cid);
            stu.setClassInfo(classInfo);
        }
        model.addAttribute("stuList",list);

        return "student/stuList";
    }

    /**
     * 修改学生信息
     * @param id
     * @return
     */
    @RequestMapping("toModifyStu")
    public String toModifyStu(Integer id,Model model){
        Student student=stuService.selectStuById(id);
        //查询学生对应班级信息
        ClassInfo classInfo = classService.selectClassById(student.getCid());
        student.setClassInfo(classInfo);

        model.addAttribute("stu",student);
        return "student/modify_stu";
    }

    /**
     * 修改学生信息
     * @return
     */
    @RequestMapping("modifyStu")
    public String modifyStu(Student student){
        System.out.println("修改后的信息："+student);
        int i = stuService.updateStudentSelectiveById(student);

        return "redirect:toStuList";
    }
}
