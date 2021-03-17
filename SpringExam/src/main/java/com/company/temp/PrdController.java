package com.company.temp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.company.temp.service.PrdService;
import com.company.temp.service.PrdVO;

@Controller
public class PrdController {

	Logger logger = LoggerFactory.getLogger(PrdController.class);
	
	@Autowired PrdService prdService;
	
	@GetMapping("/prdList")
	    public String selectList(PrdVO vo, Model model) {
	    	model.addAttribute("list", prdService.prdList(vo));
	    	return "/prd/prdList";
	    }
	 
	 @GetMapping("/prdInsert")
	    public String prdInsert(PrdVO vo, Model model) {
	    	return "/prd/prdInsert";
	    	
	    }
		
	 @PostMapping("/prdInsert")
	    public String prdInsertProc(PrdVO vo) {
	    	prdService.prdInsert(vo);
	    	return "redirect:/prdList";
	    }
}
