package controller;



import org.springframework.lang.Nullable;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControllerTest01 implements Controller {

    @Nullable
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        //返回一个模型视图对象
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg","ControllerT1");
        modelAndView.setViewName("test01");
        return modelAndView;
    }







}
