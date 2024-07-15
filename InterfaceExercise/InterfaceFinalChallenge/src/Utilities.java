enum UtilityType {ELECTRICAL, GAS, WATER, PIPE_LINE}

public class Utilities implements Mappable{
    private String name;
    private UtilityType type;

    public Utilities(String name, UtilityType type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getLabel() {
        return name + "  (" + type + ")";
    }

    @Override
    public Geometry getShape() {
        return Geometry.LINE;
    }

    @Override
    public String getMarker() {
        return switch (type){
            case ELECTRICAL -> Color.GREEN + " " + PointMarker.TRIANGLE;
            case WATER -> Color.BLUE + " " + PointMarker.STAR;
            case GAS -> Color.RED + " " + PointMarker.DIAMOND;
            case PIPE_LINE -> Color.RED + " " + PointMarker.CIRCLE;
            default -> Color.BLACK + " " + PointMarker.TRIANGLE;
        };
    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON() + ", Name :" + name + ", Usage :" + type;
    }

}
