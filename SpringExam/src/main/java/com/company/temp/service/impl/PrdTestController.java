package com.company.temp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.company.temp.service.PrdService;
import com.company.temp.service.PrdVO;

@RestController
public class PrdTestController {
	
	@Autowired PrdService prdService;
	
	    //단건조회
	    @ResponseBody
		@GetMapping("/prdSearchList/{product_id}") 
		public PrdVO getComments(PrdVO vo,
				                      @PathVariable String product_id) {
			vo.setProduct_id(product_id);
			return prdService.prdSearchList(vo);
		}
}