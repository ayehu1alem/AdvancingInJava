public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount < 0 || smallCount < 0) return false;

        int bigPack = bigCount * 5;
        int sum = bigPack + smallCount;

        if(sum == goal) return true;

        else if(sum > goal){
            if(bigPack <= goal) return true;
            else if((bigPack <= goal) && (smallCount >= goal)) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int big = 2;
        int small = 1;
        int key = 5;

        System.out.println("Result:  " + canPack(big, small, key));
    }
}
