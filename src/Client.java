public class Client {
    public static void main(String[] args) {
        House house1 = new HouseBuilder()
                .buildDoors(5)
                .buildRoof(true)
                .buildPool(true)
                .buildWalls(4)
                .build();
        System.out.println(house1);
    }
}