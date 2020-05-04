package com.example.datasystem;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
@Controller
@RequestMapping("/")
public class IndexController {
    @GetMapping(value = "/reg")
    public ModelAndView reg() {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("/user/reg");
        return mv;
    }
    @GetMapping(value = "/login")
    public ModelAndView login() {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("/user/login");
        return mv;
    }
    @GetMapping(value = "/show")
    public ModelAndView show() {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("/user/show");
        return mv;
    }
    @GetMapping(value = "/")
    public ModelAndView showIndex() {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("/user/show");
        return mv;
    }
    @GetMapping(value = "/test")
    @ResponseBody
    public String test(HttpServletRequest req) {
        return "test";
    }

}
