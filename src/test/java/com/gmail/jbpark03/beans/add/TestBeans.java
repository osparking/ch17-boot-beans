package com.gmail.jbpark03.beans.add;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

import com.gmail.jbpark03.beans.model.Country;
import com.gmail.jbpark03.beans.model.Passenger;

@TestConfiguration
public class TestBeans {
  @Bean
  Passenger createPassenger() {
    var passenger = new Passenger("김철수", createCountry(), false);
    return passenger;
  }

  @Bean
  private Country createCountry() {
    var country = new Country("대한민국", "KR");
    return country;
  }
}
