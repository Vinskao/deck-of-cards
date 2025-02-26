package com.vinskao.deckofcards.module.blackjack.service;
import com.vinskao.deckofcards.service.Deck;

public class BJDeck extends Deck {
    public BJDeck(){
        super();
    }
    
    @Override
    public void initDeck(){
        cards.clear();
        // 遍历cardConfig的key，即花色  
        for(String suit: cardConfig.keySet()){
            // 遍历cardConfig的value，即花色对应的rank
            for(String rank: cardConfig.get(suit).keySet()){
                cards.add(new BJCard(suit, rank));
            }
        }
        shuffle();
    }
}
