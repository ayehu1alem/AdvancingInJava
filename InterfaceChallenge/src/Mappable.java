
enum Geometry {LINE, POINT, POLYGON}
enum Color {BLACK, BLUE, GREEN, ORANGE, RED}
enum PointMarker {CIRCLE, PUSH_PIN, STAR, SQUARE, TRIANGLE}
enum LineMarker {DASHED, DOTTED, SOLID}

public interface Mappable {
    String JSON_PROPERTY = """
            "Properties": { %s } """;

    String getLabel();
    Geometry getShape();
    String getMarker();

    default String toJSON() {
        return """
                "type": "%s", "lebel": "%s", "maker": "%s" """
                .formatted(getShape(), getLabel(), getMarker());

    }

    static void mapIt(Mappable mapable){
        System.out.println(JSON_PROPERTY.formatted(mapable.toJSON()));
    }
}
