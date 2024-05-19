package com.example.jobking.controller;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.jobking.entity.Resume;
import com.example.jobking.entity.SelfInfo;
import com.example.jobking.repository.IResumeRepository;
import com.example.jobking.repository.ISelfInfo;

@Controller
public class KHController {

	@Autowired
	IResumeRepository ResumeRepository;
	@Autowired
	ISelfInfo SelfInfoRepository;

	@RequestMapping("/user_mainPage")
	public String mainPage() {

		return "user_mainPage";
	}

	/*
	@RequestMapping("/user_resumeList")
	public void resumeList(Model model) {
	    List<Resume> resumeList = ResumeRepository.findAll();
	    List<SelfInfo> selfList = SelfInfoRepository.findAll();

	    // SelfInfo를 Resume ID를 키로 하여 매핑
	    Map<Long, SelfInfo> selfinfoMap = selfList.stream()
	        .collect(Collectors.toMap(
	            selfInfo -> selfInfo.getResume().getRno(),
	            Function.identity(),
	            (existing, replacement) -> existing  // 키가 중복될 경우 기존 값을 유지
	        ));

	    model.addAttribute("resumeList", resumeList);
	    model.addAttribute("selfinfoMap", selfinfoMap);
	}
	*/

	
}
