package com.company.temp.service.impl;

import java.util.List;

import com.company.temp.service.PrdVO;

public interface PrdMapper {
	
public int prdInsert(PrdVO vo);

public PrdVO prdSearchList(PrdVO vo);
	
public List<PrdVO> prdList(PrdVO vo);
}
