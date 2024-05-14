public class SharedDigits {
    public static void main(String[] args) {
        int x = 12;
        int y = 42;

        System.out.println("This two numbers shared common digits:  " + hasSharedDigit(x, y));
    }

    public static boolean hasSharedDigit(int x, int y){
        if(x < 10 || y < 10 || x > 99 || y > 99)
            return false;

        int leftX = x / 10, leftY = y / 10;
        int rightX = x % 10, rightY = y % 10;

        boolean sharedX = ((leftX == leftY) || (leftX == rightY));
        boolean sharedY = ((rightY == rightX) || (rightY == leftX));

        return (sharedX || sharedY);
    }
}
