package jp.springbook.springroosample;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/helo/**")
@Controller
public class HeloController {

    @RequestMapping(method = RequestMethod.POST, value = "{id}")
    public void post(@PathVariable Long id, ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
    	// ただのサンプル？の模様
    }

    @RequestMapping
    public String index(Model model) {
    	model.addAttribute("formData", new HeloFormData());
        return "helo/index";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/form")
    public String post(@ModelAttribute HeloFormData form, Errors resut, Model model){
    	model.addAttribute("message", "You typed: " + form.getInput());
    	model.addAttribute("formData", new HeloFormData());
    	return "helo/index";
    }
    
}
