public class PersonalComputer extends Product {
    private Monitor monitor;
    private MotherBoard motherBoard;
    private ComputerCase computerCase;

    public PersonalComputer(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public PersonalComputer(String model, String manufacturer,
                            Monitor monitor,
                            MotherBoard motherBoard,
                            ComputerCase computerCase) {
        super(model, manufacturer);
        this.monitor = monitor;
        this.motherBoard = motherBoard;
        this.computerCase = computerCase;
    }
    private void drawLogo(){
        monitor.drawPixelAt(1200, 50, "yellow");
    }
    public void powerUp(){
        drawLogo();
        computerCase.pressPowerButton();
    }
    public Monitor getMonitor() {
        return monitor;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public ComputerCase getComputerCase() {
        return computerCase;
    }
}
