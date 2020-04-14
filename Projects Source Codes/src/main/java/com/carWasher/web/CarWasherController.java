package com.carWasher.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.carWasher.dao.jpa.CarWasherRepository;
import com.carWasher.model.Car;

@RestController
@RequestMapping("/carWasherController")
public class CarWasherController {

	
	@Autowired
	private CarWasherRepository repository;
	
	@RequestMapping("/cacheBustingTest")
	public ModelAndView cacheBustinTest() {
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.setViewName("cacheBustingTest");

		return modelAndView;
	}
	
	
	@RequestMapping("/car/{id}")
	public Car getCar(@PathVariable int id) {
		return repository.getCar(id);
	}
	
	
	@RequestMapping("/cars")
	public List<Car> getCars() {
		return repository.getCars();
	}

}
