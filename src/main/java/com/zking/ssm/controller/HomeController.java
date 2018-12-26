package com.zking.ssm.controller;

import com.zking.ssm.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;

@Controller
public class HomeController {

    @RequestMapping("/toHome")
    public String toHome(Book book, @RequestParam String sex,
                               @RequestParam HashMap<String,Object> maps
                       ,Model model){
        System.out.println(maps);
      /*  ModelAndView mv = new ModelAndView();
        mv.setViewName("wellcome");
        mv.addObject("data",maps);*/
        model.addAttribute("data",maps);
        return "forward:toHome1";
    }

    @RequestMapping("/toHome1")
    public String toHome1(){

        return "wellcome";
    }


}
