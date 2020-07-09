package com.dubbo.provider;

import com.dubbo.service.Say;

public class ProviderSay implements Say{

	@Override
	public String sayName(String name) {
		return "远程调用返回的name: "+name;
	}

}
