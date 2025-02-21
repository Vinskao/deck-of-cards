public class BJDeck extends Deck {
    public BJDeck(){
        super();
    }
    
    @Override
    public void initDeck(){
        cards.clear();
        for(String suit: SUITS){
            for(String rank: RANKS){
                cards.add(new BJCard(suit, rank));
            }
        }
        shuffle();
    }
}
