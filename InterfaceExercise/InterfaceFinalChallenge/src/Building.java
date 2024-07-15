enum UsageType {ENTERTAINMENT,RESIDENTIAL, COMMERCIAL, SPORTS, GOVERNMENTAL}

public class Building implements Mappable{
    private String name;
    private UsageType usage;

    public Building(String name, UsageType usage) {
        this.name = name;
        this.usage = usage;
    }

    @Override
    public String getLabel() {
        return name + "  (" + usage + ")";
    }

    @Override
    public Geometry getShape() {
        return Geometry.POINT;
    }

    @Override
    public String getMarker() {
        return switch (usage){
            case ENTERTAINMENT -> Color.GREEN + " " + PointMarker.TRIANGLE;
            case RESIDENTIAL -> Color.BLUE + " " + PointMarker.STAR;
            case COMMERCIAL -> Color.ORANGE + " " + PointMarker.DIAMOND;
            case GOVERNMENTAL -> Color.RED + " " + PointMarker.CIRCLE;
            default -> Color.BLACK + " " + PointMarker.TRIANGLE;
        };
    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON() + ", Name :" + name + ", Usage :" + usage;
    }
}
