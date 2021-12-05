package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class ResultGo {

    @RequestMapping("/result/t1")
    public void test01(HttpServletRequest request, HttpServletResponse response)throws Exception{
        response.getWriter().print("hello,Spring By servlet API");
    }

    @RequestMapping("/result/t2")
    public void test02(HttpServletRequest request, HttpServletResponse response)throws Exception{
        response.sendRedirect("/index.jsp");

    }
    @RequestMapping("/result/t3")
    public void test03(HttpServletRequest request, HttpServletResponse response)throws Exception{
        //转发
        request.setAttribute("msg","是否萨多法说的");
        request.getRequestDispatcher("/WEB-INF/jsp/test01.jsp").forward(request,response);
    }

}
