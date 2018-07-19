/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kingkong.spring_jdbc.controllers;

import com.kingkong.spring_jdbc.dao.CustomerDAO;
import com.kingkong.spring_jdbc.entities.Customer;
import com.kingkong.spring_jdbc.entities.dto.CustomerDTO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author kiran
 */
    
@Controller
@RequestMapping(value="/")  //--for root
//@ResponseBody 

public class DefaultController {
   // private Customer customer;
    
    @Autowired
    private CustomerDAO customerDAO;

    @RequestMapping(method=RequestMethod.GET)
    public String index(Model model){
        try {
            // customer=new Customer(1, "Kiran", "Maharjan", "kirnamaharjan8888@gmail.com", "9818113311", true);
            // model.addAttribute("customer", customer);

            model.addAttribute("customers",customerDAO.getAll() );
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
       return "index";  //<h1> hello </h1>
}
    
    @RequestMapping(value="/add",method = RequestMethod.GET)
    public String Add(){
    
        return "customer/add";
    }
    
    @RequestMapping(value="/add",method = RequestMethod.POST)
    public String save(@ModelAttribute("CustomerDTO") CustomerDTO cDTO){
        try {
            
            Customer c=new Customer(0, cDTO.getFirstName(),cDTO.getLastName(),cDTO.getEmail(),cDTO.getContactNo(),cDTO.isStatus());
            customerDAO.insert(c);
         } catch (Exception ex) {
            System.out.println(ex);
        }
        return "redirect:/";
    }
}
