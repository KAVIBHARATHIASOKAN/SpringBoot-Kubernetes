package com.kavi.bookmarker.kavi.bookmarker;

import com.kavi.bookmarker.BookmarkerApiApplication;
import org.springframework.boot.SpringApplication;

public class TestBookmarkerApiApplication {

	public static void main(String[] args) {
		SpringApplication.from(BookmarkerApiApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
