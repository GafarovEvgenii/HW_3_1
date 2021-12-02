public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        int miles = service.calculate(10000);
        System.out.println(miles);

        int miles2 = service.calculate(20000);
        System.out.println(miles2);

    }
}
