package quiz2;

public class Pokemon implements comparable {

    private int hp;

    public Pokemon(int inputHp) {
        this.hp = inputHp;
    }
    public int getHp() {
        return hp;
    }

    @Override
    public Object compareTo(Object input) {
        if(input instanceof Pokemon poke2) {
            if(this.hp >= poke2.getHp()) {
                return this;
            }
            else{
                return poke2;
            }
        }
        else{
            throw new ClassCastException();
        }
    }
}
