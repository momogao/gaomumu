package com.atguigu.springcloud.feign;

import com.atguigu.springcloud.service.DeptServiceClientApi;
import com.atguigu.springcloud.fallback.DeptClientServiceFallbackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 *
 * @Description: 修改microservicecloud-api工程，根据已经有的DeptClientService接口

新建

一个实现了FallbackFactory接口的类DeptClientServiceFallbackFactory
 * @author zzyy
 * @date 2018年4月21日
 */
//@FeignClient(value = "MICROSERVICECLOUD-DEPT")
@FeignClient(value = "MICROSERVICECLOUD-DEPT",fallbackFactory= DeptClientServiceFallbackFactory.class)
public interface DeptServiceClient extends DeptServiceClientApi {
}
