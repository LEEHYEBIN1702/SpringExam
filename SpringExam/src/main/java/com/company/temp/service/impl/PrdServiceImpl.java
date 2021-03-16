package com.company.temp.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.temp.service.PrdService;
import com.company.temp.service.PrdVO;

@Service
public class PrdServiceImpl implements PrdService {
	@Autowired PrdMapper dao;

	@Override
	public int prdInsert(PrdVO vo) {
		
		return dao.prdInsert(vo);
	}

	@Override
	public List<PrdVO> prdList(PrdVO vo) {
		
		return dao.prdList(vo);
	}

	@Override
	public PrdVO prdSearchList(PrdVO vo) {
	
		return dao.prdSearchList(vo);
	}
    
}
