package com.maktabsharif74.cms.springbootcmsexmaple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin-panel")
public class AdminController {

    @GetMapping
    public ModelAndView getPanel() {
        return new ModelAndView("admin-panel");
    }
}
