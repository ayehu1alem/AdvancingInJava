enum Geometry{LINE, POINT, POLYGON}
enum Color{RED, GREEN, BLUE, BLACK, ORANGE}
enum PointMarker{CIRCLE, SQUARE, TRIANGLE, STAR, DIAMOND}
enum LineMaker{SOLID, DASHED, DOTTED}


public interface Mappable {
    String JSON_PROPERTY = """
            "Property" : {%s}""";

    String getLabel();
    Geometry getShape();
    String getMarker();

    default String toJSON(){
        return """
                "Type" ; "%s",  "Label" : "%s", "Marker" : "%s" """
                .formatted(getShape(), getLabel(), getMarker());
    }

    static void mapIt(Mappable mappable){
        System.out.printf((JSON_PROPERTY) + "%n", mappable.toJSON());
    }
}
