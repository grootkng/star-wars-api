package com.victormanduca.starwars.domain.entities.dtos;

public class PlanetRequestDto {
  private String name;
  private String weather;
  private String terrain;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getWeather() {
    return weather;
  }

  public void setWeather(String weather) {
    this.weather = weather;
  }

  public String getTerrain() {
    return terrain;
  }

  public void setTerrain(String terrain) {
    this.terrain = terrain;
  }
}
