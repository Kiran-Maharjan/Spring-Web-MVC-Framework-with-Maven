/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kingkong.spring_jdbc.controllers;

import com.kingkong.spring_jdbc.dao.CustomerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author kiran
 */

@Controller
@RequestMapping(value="/order")

public class OrderController {
    @Autowired
    private CustomerDAO customerDAO;
    
    @RequestMapping(method=RequestMethod.GET)
    public String index(Model model) throws Exception {
       model.addAttribute("customers",customerDAO.getAll());
        return "order/index";
    }
    
    
    
}
