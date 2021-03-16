package com.company.temp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.temp.service.SaleService;
import com.company.temp.service.SaleVO;

@Service
public class SaleServiceImpl implements SaleService {
	
	@Autowired SaleMapper dao;

	@Override
	public int insertSale(SaleVO vo) {
		
		return dao.insertSale(vo);
	}

}
