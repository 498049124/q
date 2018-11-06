package com.szxs.controller;

import com.szxs.entity.CarResever;
import com.szxs.entity.Pager;
import com.szxs.service.CarReseverService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class CarReseverController {
    @Resource
    private CarReseverService carReseverService;

    @RequestMapping("/showList")
        public String showList(@RequestParam(required = false,defaultValue = "1") int pageNo, Integer a, String b, Model model){
        Pager<CarResever> carResevers = carReseverService.queryCarResever(pageNo,2,a,b);
        model.addAttribute("pager",carResevers);
        return "index";
    }
    @RequestMapping("/xg")
public String xg(int id){
        carReseverService.updateCarResever(id);
        return "redirect:showList";
}
}
