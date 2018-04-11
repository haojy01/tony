package org.tony.dubbo.api.impl;

import org.tony.api.Test;

public class TestImpl implements Test {

	@Override
	public String sayHello(String name) {
		return "sucesss!"+name;
	}

}
