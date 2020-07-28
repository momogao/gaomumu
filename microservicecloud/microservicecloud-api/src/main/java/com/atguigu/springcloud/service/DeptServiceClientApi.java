package com.atguigu.springcloud.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.atguigu.springcloud.entities.Dept;

public interface DeptServiceClientApi
{
	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	Dept get(@PathVariable("id") int id);

	@RequestMapping(value = "/dept/list", method = RequestMethod.GET)
	List<Dept> list();

	@RequestMapping(value = "/dept/add", method = RequestMethod.POST)
	boolean add(Dept dept);
}
