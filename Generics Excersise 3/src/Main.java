
public class Main {
    public static void main(String[] args) {

        var Ethiopian_National_Parks = new Park[]{
                new Park("Bale National Park", "44.4882, -110,5916"),
                new Park("Semen Mountains National Park", "54.4992, -200,5916"),
                new Park("Ethiopian National Park", "34.5992, -191,6195"),
        };

        Layer<Park> parkLayer = new Layer<>(Ethiopian_National_Parks);
        parkLayer.renderLayer();

        System.out.println();

        var Ethiopian_Rivers = new River[]{
                new River("Awash", "44.4882, -110,5916", "44.4882, -110,5916", "44.4882, -110,5916"),
                new River(" Abay", "54.4992, -200,5916", "44.4882, -110,5916")
        };

        Layer<River> riverLayer = new Layer<>(Ethiopian_Rivers);
        riverLayer.addElements(new River("Barro", "54.4992, -200,5916", "44.4882, -110,5916"));
        riverLayer.renderLayer();

    }
}
