package com.epam.training.sportsbetting.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class OutcomeOdd {
    @Id
    @GeneratedValue
    private int id;
    private BigDecimal value;
    private LocalDateTime validForm;
    private LocalDateTime validUntil;
    @ManyToOne(targetEntity = Outcome.class, cascade=CascadeType.ALL)
    private Outcome outcome;
    
    
    public OutcomeOdd(BigDecimal value, LocalDateTime validForm, LocalDateTime validUnit, Outcome outcome) {
        super();
        this.value = value;
        this.validForm = validForm;
        this.validUntil = validUnit;
        this.outcome = outcome;
    }


    public OutcomeOdd(BigDecimal valueOf, LocalDateTime parse, LocalDateTime parse2) {
        this(valueOf, parse, parse2, null);
    }


    public BigDecimal getValue() {
        return value;
    }


    public void setValue(BigDecimal value) {
        this.value = value;
    }


    public LocalDateTime getValidForm() {
        return validForm;
    }


    public void setValidForm(LocalDateTime validForm) {
        this.validForm = validForm;
    }


    public LocalDateTime getValidUntil() {
        return validUntil;
    }
    
    public String getStringValidUntil() {
        return validUntil.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }


    public void setValidUnit(LocalDateTime validUnit) {
        this.validUntil = validUnit;
    }


    public Outcome getOutcome() {
        return outcome;
    }


    public void setOutcome(Outcome outcome) {
        this.outcome = outcome;
    }
    
    
    public String getOutcomeDescription() {
        return outcome.getDescription();
    }
    
    public String getSportEventTitle() {
        return outcome.getSportEventTitle();
    }


    public String getBetDescription() {
        return outcome.getBetDescription();
    }


    public SportEvent getSportEvent() {
        return outcome.getSportEvent();
    }


    public String getStringValidForm() {
        return validForm.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

    }


    public int getId() {
        return id;
    }

    
}
