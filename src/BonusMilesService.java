public class BonusMilesService {
    public int calculate(int price) {
        int bonus = 20;

        int freeMiles = price/bonus;

        return freeMiles;
    }

}
