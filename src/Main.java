public class Main {

    public static void main(String[] args) {
        int ticketPrice = 150;
        int quantityRubForOneBonusMile = 20;
        int bonusMile = ticketPrice / quantityRubForOneBonusMile;
        System.out.println("Вам начисленно " + bonusMile + " бонусных миль");
    }
}
