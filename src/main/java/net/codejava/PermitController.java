package net.codejava;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PermitController {

	@Autowired
	private PermitService service; 
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Permit> listpermits = service.listAll();
		model.addAttribute("listpermits", listpermits);
		
		return "index";
	}
	
	@RequestMapping("/new")
	public String showNewpermitPage(Model model) {
		Permit permit = new Permit();
		model.addAttribute("permit", permit);
		
		return "new_permit";
	}
	
//	@RequestMapping(value = "/save", method = RequestMethod.POST)
//	public String savepermit(@ModelAttribute("permit") Permit permit) {
//		service.save(permit);
//		
//		return "redirect:/";
//	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditpermitPage(@PathVariable(name = "id") int id) {
		ModelAndView modelAndView = new ModelAndView("edit_permit");
		Permit permit = service.get(id);
		modelAndView.addObject("permit", permit);
		
		return modelAndView;
	}
	
	@RequestMapping("/delete/{id}")
	public String deletepermit(@PathVariable(name = "id") int id) {
		service.delete(id);
		return "redirect:/";		
	}
	
	@RequestMapping(value = "/action", method = RequestMethod.POST)
	public String actionPermit(@ModelAttribute("permit") Permit permit , @RequestParam(value="action", required=true) String action) {
		if (action.equalsIgnoreCase("save") || action.equalsIgnoreCase("edit")) {
		service.save(permit);
		}
		
		return "redirect:/";
	}	
	
	
	}
	

