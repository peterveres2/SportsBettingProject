package com.epam.training.sportsbetting.service;

import java.math.BigDecimal;
import java.util.List;

import com.epam.training.sportsbetting.domain.Login;
import com.epam.training.sportsbetting.domain.Player;
import com.epam.training.sportsbetting.domain.SportEvent;
import com.epam.training.sportsbetting.domain.Wager;

public interface Service {
    void savePlayer(Player player);
    Player findPlayer();
    List<SportEvent> findAllSportEvents();
    void saveWager(Wager wager);
    List<Wager> findAllWagers();
    void calculateResult();
    boolean sufficientBalance(BigDecimal wagerAmount);
    public Player validateUser(Login login);
    
}
