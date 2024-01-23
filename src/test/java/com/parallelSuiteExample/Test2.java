package com.parallelSuiteExample;

import org.testng.annotations.Test;

public class Test2 {


	@Test
	public void method4() {
		
		System.out.println("class2---method4 ---"+Thread.currentThread().getId());
	}

	@Test
	public void method5() {
		
		System.out.println("class2---method5 ---"+Thread.currentThread().getId());
	}
	
	@Test
	public void method6() {
		
		System.out.println("class2---method6 ---"+Thread.currentThread().getId());
	}
	
	
	
}
