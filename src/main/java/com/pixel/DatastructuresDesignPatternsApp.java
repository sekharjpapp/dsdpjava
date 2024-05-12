package com.pixel;

import com.pixel.bridgedp.*;
import com.pixel.j8.PropertyConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class DatastructuresDesignPatternsApp {

	public static void main(String[] args) {
		SpringApplication.run(DatastructuresDesignPatternsApp.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void go() {
		Video youtubeVideo = new YoutubeVideo(new HDProcessor());
		youtubeVideo.play("abc.mp4");
		Video netflixVideo = new NetflixVideo(new UHD4KProcessor());
		netflixVideo.play("abc.mp4");
	}
}
