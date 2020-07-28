package com.atguigu.springcloud.fallback;

import java.util.List;

import com.atguigu.springcloud.service.DeptServiceClientApi;
import org.springframework.stereotype.Component;

import com.atguigu.springcloud.entities.Dept;

import feign.hystrix.FallbackFactory;

@Component // 不要忘记添加，不要忘记添加
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptServiceClientApi>
{
	@Override
	public DeptServiceClientApi create(Throwable throwable)
	{
		return new DeptServiceClientApi() {
			@Override
			public Dept get(int id)
			{
				return null;
			}

			@Override
			public List<Dept> list()
			{
				return null;
			}

			@Override
			public boolean add(Dept dept)
			{
				return false;
			}
		};
	}
}
