package com.ipl.playerstats;

import com.ipl.playerstats.player.Infoimplementatio;
import com.ipl.playerstats.player.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


	@SpringBootApplication(scanBasePackages = "com.ipl.playerstats")
	public class PlayerstatsApplication {
		public static void main(String[] args) {
			SpringApplication.run(PlayerstatsApplication.class, args);
		}
	}


