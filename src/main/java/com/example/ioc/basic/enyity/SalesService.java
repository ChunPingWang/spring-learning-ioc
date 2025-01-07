package com.example.ioc.basic.enyity;

public class SalesService {
   private String myService;

    public SalesService(String myService) {
        this.myService = myService;
    }

    public String getMyService() {
        return myService;
    }

    public void setMyService(String myService) {
        this.myService = myService;
    }
}
