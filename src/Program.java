import java.util.ArrayList;
import java.util.List;

    public class Program {
        public static void main(String[] args) {

            Toy toy1 = new Toy(1, "Doll", 20);
            Toy toy2 = new Toy(2, "Car", 40);
            Toy toy3 = new Toy(3, "MechWarrior", 60);
            Toy toy4 = new Toy(4, "Soldier", 15);

            List<Toy> toys = new ArrayList<Toy>();
            toys.add(toy4);
            toys.add(toy3);
            toys.add(toy2);
            toys.add(toy1);

            ToyShop toyStore = new ToyShop(toys);
            toyStore.saveForLottery();
            toyStore.saveForLottery();
            toyStore.saveForLottery();
            toyStore.saveForLottery();

        }

    }
