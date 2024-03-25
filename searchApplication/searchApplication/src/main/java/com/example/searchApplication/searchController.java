package com.example.searchApplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import ch.qos.logback.core.model.Model;


@Controller
public class searchController {

    @GetMapping("/index")
    public String searchbox(){
        return"/index";
    }
    @GetMapping("/search")
    public RedirectView getMethodName(@RequestParam("q") String q, Model m) {
        String url = "http://www.google.com/search?q="+q;
       RedirectView redirectView = new RedirectView();
       redirectView.setUrl(url);
        return redirectView;
    }
    
}
