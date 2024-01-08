package com.gmail.jbpark03.beans.regist;

import org.springframework.context.ApplicationEvent;

import com.gmail.jbpark03.beans.model.Passenger;

import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("serial")
@Setter
@Getter
public class PassengerRegistEvent extends ApplicationEvent {
  private Passenger passenger;

  public PassengerRegistEvent(Passenger passenger) {
    super(passenger);
    this.passenger = passenger;
  }
}
