public class Main {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("2208", "Dell", "240");
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, "1920x1080");
        MotherBoard theMotherBoard = new MotherBoard("BJ-200", "Asus", 4, 6, "v2.44");

        PersonalComputer thePC = new PersonalComputer("OMEN", "Asus", theMonitor, theMotherBoard, theCase);
//        thePC.getMonitor().drawPixelAt(10, 10, "Black");
//        thePC.getMotherBoard().loadProgram("Windows 10");
//        thePC.getComputerCase().pressPowerButton();
        thePC.powerUp();

    }
}
