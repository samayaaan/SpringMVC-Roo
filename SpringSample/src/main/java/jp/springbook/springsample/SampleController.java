package jp.springbook.springsample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController {

	@RequestMapping(value = "/helo", method = RequestMethod.GET)
	public String helo(Model model){
		SampleFormModel fm = new SampleFormModel();
		fm.setInput1("何か書け");
		model.addAttribute("sampleFormModel", fm);
		model.addAttribute("message", "何か書くと…");
		return "showMessage";
	}
	
	@RequestMapping(value = "/helo", method = RequestMethod.POST)
	public String form(@ModelAttribute SampleFormModel fm, Model model){
		model.addAttribute("message", "you typed: " + fm.getInput1());
		return "showMessage";
	}
	
	@RequestMapping(value = "/helo2", method = RequestMethod.GET)
	public ModelAndView helo2(){
		ModelAndView modelAndView = new ModelAndView("showMessage2");
		modelAndView.addObject("title", "ModelAndVew sample");
		modelAndView.addObject("message", "ModelAndVewのテスト");
		
		SampleFormModel model = new SampleFormModel();
		model.setInput1("ここに書くと");
		modelAndView.addObject("sampleFormModel", model);
		return modelAndView;
	}
	
	@RequestMapping(value = "/helo2", method = RequestMethod.POST)
	public ModelAndView form2(@ModelAttribute SampleFormModel model){
		String input1 = model.getInput1();
		
		ModelAndView modelAndView = new ModelAndView("showMessage2");
		modelAndView.addObject("title", "ModelAndVew sample");
		modelAndView.addObject("message", "typed: " + input1);
		modelAndView.addObject("sampleFormModel", model);
		return modelAndView;
	}
	
	
}
