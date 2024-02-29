package com.training.springmvc.controller;



import com.training.springmvc.model.Product;
import com.training.springmvc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    ProductService service;
    @RequestMapping(method = RequestMethod.GET)
    public String greet(Model model){

        List<Product> productList = service.getAllProducts();
        model.addAttribute("prodList",productList);
        System.out.println(productList);
        return "home";  //this is string which is name of file ie view name ie jsp file
    }

    @RequestMapping(value="/insertPage" ,method = RequestMethod.GET)
    public String insertPage(){
        //service.insertProduct(product);
        return "insert";    //this will lead to insert.jsp
    }
    //after baseurl/insertpage is called it leads to insert.jsp
    //over there html form is there
    //in that form action is baseurl/insert this will lead to call below controller
    //this controller will then insert its below fns and it returns to "redirect:/" this is root url i.e base url
    
    @PostMapping(value="/insert")
    public String insertProduct(@ModelAttribute Product product){
        service.insertProduct(product);
        return "redirect:/";
        //return "demo";
    }

}