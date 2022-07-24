package com.sk;

import java.io.File;
import org.alicebot.ab.*;
import org.alicebot.ab.utils.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class ChatBot1Application {

	private static final boolean TRACE_MODE = true;

	public static void main(String[] args) {
		SpringApplication.run(ChatBot1Application.class, args);

		try {

			String resourcepath = getpath();

			MagicBooleans.trace_mode = TRACE_MODE;

			Bot b = new Bot("super", resourcepath);

			Chat chatsession = new Chat(b);
			String textline = "";

			while (true) {
				System.out.println("YOU: ");

				textline = IOUtils.readInputTextLine();
				if (textline == null ||

						textline.length() < 1) {

					textline = MagicStrings.null_input;

				} else if (textline.equals("q")) {
					System.exit(0);
				} else if (textline.equals("wq")) {
					b.writeQuit();
					System.exit(0);
				} else {
					String request = textline;
					String

					response = chatsession.multisentenceRespond(request);
					System.out.println("BOT: " + response);
				}
			}
		} catch (Exception e) {
		}
	}

	private static String getpath() {
		File currd = new File(".");
		String path = currd.getAbsolutePath();
		String resourcepath = path + File.separator + "src" + File.separator + "main" + File.separator + "resources";
		return resourcepath;
	}
}
