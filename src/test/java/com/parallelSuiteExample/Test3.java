package com.parallelSuiteExample;

import org.testng.annotations.Test;

public class Test3 {
	
	

	@Test
	public void method7() {
		
		System.out.println("class3---method7 ---"+Thread.currentThread().getId());
	}

	@Test
	public void method8() {
		
		System.out.println("class3---method8 ---"+Thread.currentThread().getId());
	}
	
	@Test
	public void method9() {
		
		System.out.println("class3---method9 ---"+Thread.currentThread().getId());
	}
	
	

}
