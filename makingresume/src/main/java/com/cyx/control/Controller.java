package com.cyx.control;

import com.cyx.pojo.People;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.cyx.service.*;
import java.util.List;


@org.springframework.stereotype.Controller
@RequestMapping("/resume")
public class Controller {
    @Autowired
    private resumeService resumeService;
    @RequestMapping("/allResume")
    public String showAll(Model model){
        List<People> list = resumeService.selectAll();
        model.addAttribute("list",list);
        return "allResume";
    }

    @RequestMapping("/toaddResume")
    public String toaddOne(){
        return "addResume";
    }

    @RequestMapping("/addResume")
    public String addOne(People people){
        System.out.println(people);
        resumeService.addPeopleResume(people);
        return "redirect:/resume/allResume";

    }
    @RequestMapping("/toupdateResume")
    public String toupdateOne(Model model,int id){
        People people = resumeService.selectResumeByID(id);
        System.out.println("update people ID  "+ id);
        model.addAttribute("people",people);
        return "updateResume";
    }
    @RequestMapping("/updateResume")
    public String updateOne(People people,Model model){
        System.out.println("update-- people-- ID"+people.getPeopleID());
        resumeService.updatePeopleResume(people);
        People people1 = resumeService.selectResumeByID(people.getPeopleID());
        model.addAttribute("people",people1);
        return "redirect:/resume/allResume";
    }
    @RequestMapping("/deleteResume")
    public String deleteOne(int id){
        System.out.println("delete ID" +id);
        resumeService.deletePeopleByID(id);
        return "redirect:/resume/allResume";

    }
}
