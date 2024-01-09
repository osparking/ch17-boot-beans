package com.gmail.jbpark03.beans;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import com.gmail.jbpark03.beans.add.TestBeans;
import com.gmail.jbpark03.beans.model.Passenger;
import com.gmail.jbpark03.beans.regist.PassengerRegistEvent;
import com.gmail.jbpark03.beans.regist.RegistManager;

@SpringBootTest
@Import(TestBeans.class)
class RegistTest {

  @Autowired
  private RegistManager manager;

  @Autowired
  private Passenger passenger;

  @Test
  void test() {
    var event = new PassengerRegistEvent(passenger);
    System.out.println("사건 발생 후:" + passenger);
    manager.getContext().publishEvent(event);
    assertTrue(passenger.isRegistered());
  }
}