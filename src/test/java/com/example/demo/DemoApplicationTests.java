package com.example.demo;

import com.example.demo.controller.TestController;
import org.junit.jupiter.api.Test;
import org.springframework.asm.ClassReader;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.net.URL;
import java.util.Enumeration;

//@SpringBootTest
class DemoApplicationTests {

	public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
		ClassLoader.getSystemClassLoader().loadClass("com.example.demo.controller.TestController");
//		Class.forName("com.example.demo.controller.TestController");
		System.out.println(TestController.class.getClassLoader().getClass());
		System.out.println(new String().getClass().getClassLoader());
	}
	@Test
	void contextLoads() throws IOException {

//		ClassReader reader = new ClassReader("com.example.demo.controller.TestController");
//		TestVisitor v = new TestVisitor();
//		reader.accept(v,ClassReader.SKIP_DEBUG);



	}

}
