package dev.lpa.model;

public class LPAStudent extends Student {
    private double percentComplete;

    public LPAStudent(){
        percentComplete = random.nextDouble(0, 100.00);
    }

    public String toString(){
        return "%s %8.2f%%".formatted(super.toString(), percentComplete);
    }

    public double getPercentComplete() {
        return percentComplete;
    }
}
