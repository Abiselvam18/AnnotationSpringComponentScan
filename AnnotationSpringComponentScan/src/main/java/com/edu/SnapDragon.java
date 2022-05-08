package com.edu;

import org.springframework.stereotype.Component;

@Component
public class SnapDragon implements MobileProcessor {

	public void processor() {
		System.out.println("Worlds Best Processor");
		
	}

}