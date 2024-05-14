public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature){

        boolean isPlaying = false;
        if(!summer){
            for(int i=25; i<=35; i++)
                if(temperature == i)
                    isPlaying = true;
        }

        else{
            for(int j=25; j<=45; j++)
                if(temperature == j)
                    isPlaying = true;
        }

        return isPlaying;
    }

    public static void main(String[] args) {
        boolean isPlaying1 = isCatPlaying(true, 10);
        boolean isPlaying2 = isCatPlaying(false, 36);
        boolean isPlaying3 = isCatPlaying(false, 35);

        System.out.println(isPlaying1);
        System.out.println(isPlaying2);
        System.out.println(isPlaying3);
    }
}
