public class Main {
        public static void main(String[] args) {
            BonusMilesService service = new BonusMilesService();
            int cost = 1000;
            int miles = service.calculate(cost);
            System.out.println(miles);
    }
}
