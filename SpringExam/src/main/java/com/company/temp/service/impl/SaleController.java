package com.company.temp.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.company.temp.service.SaleService;
import com.company.temp.service.SaleVO;

@Controller
public class SaleController {

	@Autowired
	SaleService saleService;

	@PostMapping("/insertSale") // 등록처리
	@ResponseBody
	public String insertSaleProc(SaleVO vo) {
		  saleService.insertSale(vo);
		return "result : true";
	}
}
