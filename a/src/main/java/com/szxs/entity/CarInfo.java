package com.szxs.entity;


import java.util.Date;

public class CarInfo {

  private long carId;
  private String carType;
  private double capacity;
  private String manufacturer;
  private Date produceDate;
  private double price;


  public long getCarId() {
    return carId;
  }

  public void setCarId(long carId) {
    this.carId = carId;
  }


  public String getCarType() {
    return carType;
  }

  public void setCarType(String carType) {
    this.carType = carType;
  }


  public double getCapacity() {
    return capacity;
  }

  public void setCapacity(double capacity) {
    this.capacity = capacity;
  }


  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public Date getProduceDate() {
    return produceDate;
  }

  public void setProduceDate(Date produceDate) {
    this.produceDate = produceDate;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

}
