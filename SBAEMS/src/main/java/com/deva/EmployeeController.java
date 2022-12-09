package com.deva;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.deva.model.Employee;
import com.deva.repo.EmployeeRepo;

	@Controller
	public class EmployeeController {
			
			@Autowired
			private EmployeeRepo empRepo;
			
			@RequestMapping("/")
			public String home()
			{
				return "empreg";
			}
			
			@RequestMapping("/empsave")
			public String empSave(@RequestParam Integer id,
								  @RequestParam String name,
								  @RequestParam String password,
								  @RequestParam String email,
								  @RequestParam String address,
								  Employee emp, Model m){
				Employee e1=empRepo.save(emp);
				return "success";	
			}
		 /* It provides list of employees in model object */    
		    @RequestMapping("/getAll")    
		    public String viewemp(Model model){    
		        model.addAttribute("emps",empRepo.findAll());
		        return "viewemp";   
		    }
		    // Delete Employees 
		    @RequestMapping(value="/delete/{id}")    
		    public String delete(@PathVariable Integer id){    
		    	empRepo.deleteById(id);    
		        return "redirect:/viewemp";    
		    }    
		}