public class BuilderPatternTest {
    public static void main(String[] args) {
        Computer gamingComputer = new Computer.Builder()
                .setCPU("Intel i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 3080")
                .setMotherboard("ASUS ROG")
                .build();

        Computer officeComputer = new Computer.Builder()
                .setCPU("Intel i5")
                .setRAM("16GB")
                .setStorage("512GB SSD")
                .setGraphicsCard("Integrated")
                .setMotherboard("Gigabyte")
                .build();

        System.out.println("Gaming Computer Configuration:");
        System.out.println("CPU: " + gamingComputer.getCPU());
        System.out.println("RAM: " + gamingComputer.getRAM());
        System.out.println("Storage: " + gamingComputer.getStorage());
        System.out.println("Graphics Card: " + gamingComputer.getGraphicsCard());
        System.out.println("Motherboard: " + gamingComputer.getMotherboard());

        System.out.println("\nOffice Computer Configuration:");
        System.out.println("CPU: " + officeComputer.getCPU());
        System.out.println("RAM: " + officeComputer.getRAM());
        System.out.println("Storage: " + officeComputer.getStorage());
        System.out.println("Graphics Card: " + officeComputer.getGraphicsCard());
        System.out.println("Motherboard: " + officeComputer.getMotherboard());
    }
}
