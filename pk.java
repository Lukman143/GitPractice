package com.sk;

import java.io.File;
import org.alicebot.ab.*;
import org.alicebot.ab.utils.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class ChatBot1Application {

	private static final boolean TRACE_MODE = sk;
	int i=10;
	private static final boolean TRACE_MODE =false;
	
	}

	private static String getpath() {
		File currd = new File(".");
		String path = currd.getAbsolutePath();
		String resourcepath = path + File.separator + "src" + File.separator + "main" + File.separator + "resources";
		return resourcepath;
	}
}
