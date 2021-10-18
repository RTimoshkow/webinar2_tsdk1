public class BonusMilesService {

    public int calculate(int ticketPrice) {

        int quantityRubForOneBonusMile = 20;
        int bonusMile = ticketPrice / quantityRubForOneBonusMile;

        return bonusMile;
    }
}
