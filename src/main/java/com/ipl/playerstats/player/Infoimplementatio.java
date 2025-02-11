package com.ipl.playerstats.player;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


public class Infoimplementatio implements  Info{

    @Override
    public String chennai() {
        return "Dhoni";
    }

    @Override
    public String delhi() {
        return "Rishab pant";
    }

    @Override
    public String mumbai() {
        return "Rohit Sharma";
    }

    @Override
    public String hyderabad() {
        return "Pat cummins";
    }
}

