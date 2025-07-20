package com.cognizant.loan.Model;

public class Loan {
    private String number;
    private double loan,emi;
    private String type;
    private double tenure;


    public Loan(String number,double loan,double emi,String type,double tenure){
        this.emi=emi;
        this.loan=loan;
        this.number=number;
        this.tenure=tenure;
        this.type=type;


    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getLoan() {
        return loan;
    }

    public void setLoan(double loan) {
        this.loan = loan;
    }

    public double getEmi() {
        return emi;
    }

    public void setEmi(double emi) {
        this.emi = emi;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getTenure() {
        return tenure;
    }

    public void setTenure(double tenure) {
        this.tenure = tenure;
    }
}
