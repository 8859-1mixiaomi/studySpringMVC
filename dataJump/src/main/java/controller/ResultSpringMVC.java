package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ResultSpringMVC {

    @RequestMapping("/rsm/t1")
    public String test01(){
        //转发
        return "/index.jsp";
    }

    @RequestMapping("/rsm/t2")
    public String test02(){
        //转发二
        return "forward:/index.jsp";
    }

    @RequestMapping("/rsm/t3")
    public String test03(){
        //重定向
        return "redirect:/index.jsp";
    }

}
