package com.ipl.playerstats.player;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="player_stats")
public class Player {
    @Id
    private String batsman;
    private int total_runs;
    private int out;
    private int numberofballs;
    private Double average;  // Change primitive 'double' to 'Double'

    private double strikerate;

    private String name;

    public Player() {
    }

    // Constructor
    public Player(String batsman, int total_runs, int out, int numberofballs, Double average, double strikerate) {
        this.batsman = batsman;
        this.total_runs = total_runs;
        this.out = out;
        this.numberofballs = numberofballs;
        this.average = average;  // Now can accept null
        this.strikerate = strikerate;
    }

    // Getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBatsman() {
        return batsman;
    }

    public void setBatsman(String batsman) {
        this.batsman = batsman;
    }

    public int getTotal_runs() {
        return total_runs;
    }

    public void setTotal_runs(int total_runs) {
        this.total_runs = total_runs;
    }

    public int getOut() {
        return out;
    }

    public void setOut(int out) {
        this.out = out;
    }

    public int getNumberofballs() {
        return numberofballs;
    }

    public void setNumberofballs(int numberofballs) {
        this.numberofballs = numberofballs;
    }

    public double getStrikerate() {
        return strikerate;
    }

    public void setStrikrate(double strikerate) {
        this.strikerate = strikerate;
    }

    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        this.average = average;
    }
}
