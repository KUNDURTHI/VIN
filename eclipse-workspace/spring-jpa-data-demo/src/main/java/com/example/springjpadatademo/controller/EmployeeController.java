package com.example.springjpadatademo.controller;

import com.example.springjpadatademo.dao.TestRepository;
import com.example.springjpadatademo.dao.VINExtended;
import com.example.springjpadatademo.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

   @Autowired
    private TestRepository testRepository;

   private VINExtended vinExtended;
    @GetMapping("/saveEmployee")
    public @ResponseBody String save(){
        Test test1 = new Test();
        test1.setName("abc");

        return "Employee Details Saved Successfully";
    }


    @PostMapping("/saveEmployees")
    public @ResponseBody String createEmployee(@RequestBody Test test){
        Test test1 = new Test();
        test1.setName("abc");

        return "Employee Details Saved Successfully";
    }


    @GetMapping("/getEmployees")
    public List<Test> GetAllTests()
    {
        return testRepository.findAll();
    }

    @GetMapping("/")
    public String getMessage(){
        return "Hello";
    }

    @GetMapping("/getVin")
    public String GetVinXml() {
        String vin = "JH4TB2H26CC000000";
        if (vin != null) {
            return vinExtended.getVinResponse(vin);
        } else {
            return null;
        }
    }
}
