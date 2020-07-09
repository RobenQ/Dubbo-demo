package com.consumer.serviceimpl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.consumer.service.Say;

public class SayImpl implements Say{

	@Reference
	private com.dubbo.service.Say providerService;
	
	@Override
	public String sayName(String name) {
		String returnname = providerService.sayName(name);
		return returnname;
	}

}
