package com.cognizant.loan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/loans")
public class LoanController {
  @GetMapping("/{number}")
    public Loan getLoanDetails(@PathVariable String number){
      return new Loan(number,"car",400000,3258,18);
  }
  static class Loan{
      private String number;
      private String type;
      private int tenure;
      private double emi;
      private double loan;

      public Loan(String number, String type,double emi, double loan,int tenure) {
          this.number = number;
          this.type = type;
          this.tenure = tenure;
          this.emi = emi;
          this.loan = loan;
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

      public int getTenure() {
          return tenure;
      }

      public void setTenure(int tenure) {
          this.tenure = tenure;
      }

      public double getEmi() {
          return emi;
      }

      public void setEmi(double emi) {
          this.emi = emi;
      }

      public double getLoan() {
          return loan;
      }

      public void setLoan(double loan) {
          this.loan = loan;
      }
  }



}
