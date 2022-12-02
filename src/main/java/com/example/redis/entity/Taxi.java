package com.example.redis.entity;

import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;
import java.util.Objects;

@RedisHash("Taxi")
public class Taxi implements Serializable {

    private String id;
    private String name;
    public enum Color {
        RED, BLUE, GREEN
    }
    private Color color;
    private int avgSpeed;
    private int avgPassenger;

    public Taxi() {
    }

    public Taxi(String id, String name, Color color, int avgSpeed, int avgPassenger) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.avgSpeed = avgSpeed;
        this.avgPassenger = avgPassenger;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getAvgSpeed() {
        return avgSpeed;
    }

    public void setAvgSpeed(int avgSpeed) {
        this.avgSpeed = avgSpeed;
    }

    public int getAvgPassenger() {
        return avgPassenger;
    }

    public void setAvgPassenger(int avgPassenger) {
        this.avgPassenger = avgPassenger;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Taxi taxi)) return false;
        return avgSpeed == taxi.avgSpeed && avgPassenger == taxi.avgPassenger && Objects.equals(id, taxi.id) && Objects.equals(name, taxi.name) && color == taxi.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, color, avgSpeed, avgPassenger);
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", color=" + color +
                ", avgSpeed=" + avgSpeed +
                ", avgPassenger=" + avgPassenger +
                '}';
    }
}
