package com.tnh.pagehelper.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tnh.pagehelper.domain.TbUser;
import com.tnh.pagehelper.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class PageController {
    @Autowired
    private TbUserService tbUserService;
    @RequestMapping(value = {"","index"})
    //@RequestParam(defaultValue = "1")获取页面携带的参数，如果没有默认为1
    public String index(Model model, @RequestParam(defaultValue = "1") Integer page){
        PageHelper.startPage(page,5);
        List<TbUser> select = tbUserService.select();
        //分页信息
        model.addAttribute("pageInfo",new PageInfo<TbUser>(select));
        //返回用户数据
        model.addAttribute("users",select);
        return "index";
    }
}
