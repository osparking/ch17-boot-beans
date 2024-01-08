package com.gmail.jbpark03.beans.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
@Getter
@Setter
@AllArgsConstructor
public class Passenger {
  private String name;
  private Country country;
  private boolean registered = false;
}
