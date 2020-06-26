package com.verros.rest.dto;

public class ConvertGreekToGreeklishDto {
  private String text;

  public ConvertGreekToGreeklishDto(String text) {
    this.text = text;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }
}
