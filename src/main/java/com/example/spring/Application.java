package com.example.spring;

import java.util.ArrayList;
import java.util.List;

import com.example.spring.runner.ConfigRunner;
import com.example.spring.runner.JavaConfigRunner;

public class Application {
	public static void main(String[] args) {
		List<ConfigRunner> runnerList = new ArrayList<>();
		runnerList.add(new JavaConfigRunner());
		
		for(ConfigRunner configRunner : runnerList){
			configRunner.run();
		}
	}
}
