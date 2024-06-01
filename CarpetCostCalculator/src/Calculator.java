

class Floor {
    private double width;
    private double length;

    public Floor(double width, double length){
        if(width < 0){
            width = 0;
        } else {
            this.width = width;
        }

        if(length < 0){
            length = 0;
        } else {
            this.length = length;
        }
    }

    public double getArea(){
        return (this.width * this.length);
    }
}


class Carpet {
    private double cost;

    public Carpet(double cost){
        if(cost < 0){
            cost = 0;
        }else{
            this.cost = cost;
        }
    }

    public double getCost(){
        return this.cost;
    }
}

class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet){
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost(){
        return (this.floor.getArea() * this.carpet.getCost());
    }
}
