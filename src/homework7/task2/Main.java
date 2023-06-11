package homework7.task2;


public class Main {
    public static void main(String[] args) {
        Computer computer1= new Computer(1230, "Ryzen 3");
        Computer computer2= new Computer(1560, "Intel i5",
                new HDD("Toshiba", 2, "internal"),
                new RAM("Samsung", 16 ));
        System.out.println("First PC: "+computer1);
        System.out.println("Second PC: "+computer2);

    }
}
