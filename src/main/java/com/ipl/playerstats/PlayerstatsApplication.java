package com.ipl.playerstats;

import com.ipl.playerstats.player.Infoimplementatio;
import com.ipl.playerstats.player.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class PlayerstatsApplication implements CommandLineRunner {

	private Infoimplementatio captain;

	public PlayerstatsApplication(Infoimplementatio infoimplementatio){
		this.captain = infoimplementatio;
	}

	public static void main(String[] args) {
		SpringApplication.run(PlayerstatsApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Captain of CSK is: " + captain.chennai());
		System.out.println("delhi of CSK is: " + captain.delhi());
		System.out.println("hyderabad of CSK is: " + captain.hyderabad());
		System.out.println("captain of MI is: " + captain.mumbai());
	}
}
