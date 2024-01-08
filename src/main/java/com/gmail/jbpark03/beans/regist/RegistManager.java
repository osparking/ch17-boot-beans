package com.gmail.jbpark03.beans.regist;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import lombok.Getter;

@Service
@Getter
public class RegistManager implements ApplicationContextAware {
  private ApplicationContext context;

  @Override
  public void setApplicationContext(ApplicationContext context)
      throws BeansException {
    this.context = context;
  }
}
