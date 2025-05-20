package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Build {
	@Autowired
	Something smtng;
	public void building() {
		smtng.build();
		System.out.println("Building Your Project...");
	}
}