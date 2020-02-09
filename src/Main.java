public class Main {

    public static void makeCatHappy(DomesticCat cat) {
        // TODO поднимите или опустите температуру в доме, чтобы кот:) был счастлив
        if (cat.getHouse().getTemperature() < DomesticCat.WARM_TEMPERATURE) {
            for (int i = cat.getHouse().getTemperature(); i <= DomesticCat.WARM_TEMPERATURE; i++) {
                cat.getHouse().makeWarmer();
            }
        } else if (cat.getHouse().getTemperature() > DomesticCat.MAX_TEMPERATURE) {
            for (int i = cat.getHouse().getTemperature(); i >= DomesticCat.WARM_TEMPERATURE + 1; i--) {
                cat.getHouse().makeColder();
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            DomesticCat myCat = DomesticCat.makeRandomCat();

            makeCatHappy(myCat);

            if (myCat.isHappy()) {
                System.out.println("Cat " + i + " is happy!!! House is warm");
            } else {
                System.out.println("Cat " + i + " is not happy :(. " +
                        "House temperature " + myCat.getHouse().getTemperature() + "C is not comfortable");
            }
        }
    }
}
