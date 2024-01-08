package com.gmail.jbpark03.beans.regist;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class PassengerRegistListener {
  @EventListener
  public void conformRegist(PassengerRegistEvent event) {
    var passenger = event.getPassenger();
    passenger.setRegistered(true);
    System.out.println("등록된 승객 정보: " + passenger.toString());
  }
}
