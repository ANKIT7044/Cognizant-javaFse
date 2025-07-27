package com.cognizant.account.Model;



public class account {
    private String number;
    private  String  type;
    private double bal;


    public account(String number, String type, double bal) {
        this.number = number;
        this.type = type;
        this.bal = bal;
    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getBal() {
        return bal;
    }

    public void setBal(double bal) {
        this.bal = bal;
    }
}
