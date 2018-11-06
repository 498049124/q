package com.szxs.entity;


public class CarResever {

  private long reseverId;
//  private long carId;
  private String status;
  private CarInfo carInfo;

  public CarInfo getCarInfo() {
    return carInfo;
  }

  public void setCarInfo(CarInfo carInfo) {
    this.carInfo = carInfo;
  }

  public long getReseverId() {
    return reseverId;
  }

  public void setReseverId(long reseverId) {
    this.reseverId = reseverId;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

}
