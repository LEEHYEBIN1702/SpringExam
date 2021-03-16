package com.company.temp.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.company.common.MovieTest;

@Controller
public class MovieController {

	@Autowired
	MovieTest movieTest;

	@RequestMapping("/boxOffice")
	@ResponseBody
	public List<String> boxOffice() { // [ = 리스트 , { = map
		List<String> list = new ArrayList<>();
		Map map = movieTest.getBoxOffice();
		Map boxOfficeResult = (Map) map.get("boxOfficeResult");
		List<Map> dailyBoxOfficeList = (List<Map>) boxOfficeResult.get("dailyBoxOfficeList");
		for (Map movie : dailyBoxOfficeList) {
			list.add((String) movie.get("movieNm") + ":" + (String) movie.get("movieCd"));
		}

		return list;
	}

	   @RequestMapping("/movieDirector")
	   @ResponseBody
	   public List<String> movieActor() { 
	      List<String> list = new ArrayList<>();
	      Map map = movieTest.getMovieInfo();
	      Map movieInfoResult = (Map) map.get("movieInfoResult");
	      Map movieInfo = (Map) movieInfoResult.get("movieInfo");
	      List<Map> directors = (List<Map>) movieInfo.get("directors");
	      for (Map movie : directors) {
	         list.add((String) movie.get("peopleNm"));
	      }
	      return list;
	   }
}
