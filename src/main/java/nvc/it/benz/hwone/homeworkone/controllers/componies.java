package nvc.it.benz.hwone.homeworkone.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class componies {
    @GetMapping("/employee")
    @ResponseBody
    public String employee(){
        return "Employee";
    }

    @GetMapping("/employee/{id}")
    @ResponseBody
    public String employee(@PathVariable int id){
        return "Employee ID. " + id ;
    }

    @GetMapping("/employee/name/{name}")
    @ResponseBody
    public String name(@PathVariable String name){
        return "Employee name : " + name ;
    }

    @GetMapping("/employee/department/{department}")
    @ResponseBody
    public String department(@PathVariable String department){
        return "Employee in: " + department;
    }

    @PostMapping("/employee")
    @ResponseBody
    public String CreateEmployee (@RequestBody String name){
        return "Created Employee " + name;
    }
}
