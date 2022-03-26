package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController {

		
	private static final Member Member = null;
	@Autowired
	Memberreposetary memberreposetary;
	@PostMapping("/")
	public Member save(@RequestBody Member member)
	{
		return memberreposetary.save(member);
	}
	
	@GetMapping("/")
	public List<Member> getAllList()
	{
		
		List<Member>list= memberreposetary.findAll();
		return list;
	}

//public void bmi()
//{
//	double bmi=0;
//	bmi=(Member.weight/(Member.height/100));
//
//}
@GetMapping("1")
public String b()
{
	//bmi();
	if(Member.bmi<=18.5)
	{
		return  "underweight";
	}
	else if(Member.bmi<=25)
	{
		return "normal";
	}
	else if(Member.bmi<=30)
	{
		return "overweigh";
	}
	else
	{
		return "obese";
	}
	
}

	}
	

	

