package com.ipl.playerstats.config;

import com.ipl.playerstats.player.Infoimplementatio;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Infoconfig {

    @Bean
    public Infoimplementatio info(){
        return new Infoimplementatio();
    }

}
