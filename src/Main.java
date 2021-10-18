public class Main {

    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int ticketPrice = 10_000;
        int bonusMile = service.calculate(ticketPrice);
        System.out.println("Вам начисленно " + bonusMile + " бонусных миль");

    }
}
