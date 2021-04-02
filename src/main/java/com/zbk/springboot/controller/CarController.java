package com.zbk.springboot.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.zbk.springboot.ResponseData;
import com.zbk.springboot.ResponseUtil;
import com.zbk.springboot.entity.Car;
import com.zbk.springboot.entity.Pager;
import com.zbk.springboot.jwt.PassToken;
import com.zbk.springboot.jwt.UserLoginToken;
import com.zbk.springboot.service.CarService;

@RestController
@RequestMapping("/car")
public class CarController {
	
	@Autowired
	public CarService carService;
	
	@Value("${server.port}")
	private String port;
	
	@UserLoginToken
	@GetMapping("/all")
	@ResponseBody
	public ResponseData GetAll(){
		
		return ResponseUtil.success(carService.FindAll());
	}
	
	
	@UserLoginToken
	@GetMapping("/page")
	@ResponseBody
	public ResponseData Page(@RequestBody Pager pager){
		PageHelper.startPage(pager.getCurrentPage(), pager.getPageSize());
		
		return ResponseUtil.success(carService.FindAll());
	}
	
	@UserLoginToken
	@GetMapping("/getCar/{id}")
	public Car Single(@PathVariable String id){
		return carService.FindCar(id);
	}
	
	@PassToken
	@GetMapping("/test/{params}")
	public String Test(@PathVariable String params) {
		
		return "当前params值为:" +params;
	}
	
	@PassToken
	@GetMapping("/getName")
	public String Port() {
		
		return "当前端口值为:" +this.port;
	}

}
