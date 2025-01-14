package com.epam.training.sportsbetting.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class Player extends User {
    
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int accountNumber;
    private BigDecimal balance;
    private LocalDate birth;
    @Enumerated(EnumType.STRING)
    private Currency currency;
    private String participan1;
    private String participant2;
    
    public Player() {
        super();
    }
    
    public Player(String name, int accountNumber, BigDecimal balance, LocalDate birth, Currency currency) {
        super();
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.birth = birth;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public BigDecimal getBalance() {
        return balance;
    }
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
    public LocalDate getBirth() {
        return birth;
    }
    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }
    public Currency getCurrency() {
        return currency;
    }
    public void setCurrency(Currency currency) {
        this.currency = currency;
    }


    public String getParticipan1() {
        return participan1;
    }


    public void setParticipan1(String participan1) {
        this.participan1 = participan1;
    }


    public String getParticipant2() {
        return participant2;
    }


    public void setParticipant2(String participant2) {
        this.participant2 = participant2;
    }


    public void increasePlayerBalanace(BigDecimal val) {
        balance = balance.add(val);
        
    }
    
    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
