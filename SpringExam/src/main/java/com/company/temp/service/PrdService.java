package com.company.temp.service;

import java.util.List;


public interface PrdService {
	
	public int prdInsert(PrdVO vo);
	
	public PrdVO prdSearchList(PrdVO vo);
	
	public List<PrdVO> prdList(PrdVO vo);
}
