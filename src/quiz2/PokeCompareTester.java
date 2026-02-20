package quiz2;

public class PokeCompareTester {
    public static void main(String[] args) {
        Charmander charm = new Charmander();
        Squirtle squi = new Squirtle();
        Pokemon bulkier = (Pokemon) charm.compareTo(squi);
        System.out.println("The bulkier pokemon's hp is: " + bulkier.getHp());


    }
}
