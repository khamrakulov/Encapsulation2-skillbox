import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(2, 3, 4);
        CargoInfo cargoInfo = new CargoInfo(dimensions,
                5,
                "address",
                true,
                "id",
                false
        );

        System.out.println(cargoInfo.dimensions.height);
        System.out.println(cargoInfo.dimensions.width);
        System.out.println(cargoInfo.dimensions.length);
    }
}