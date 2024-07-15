public class ScopeChercker {
    public int publicVar = 0;
    private int privateVar = 1;

    public ScopeChercker() {
        System.out.println("Scope check created = "
        + publicVar + ":  PrivateVar = " + privateVar);
    }

    public int getPrivateVar() {
        return privateVar;
    }

    public void timesTwo(){
        int privateVar = 2;
        for(int i=0; i<10;){
            System.out.println(i + " times two (x2)  = " + i * privateVar);
            i++;
        }
    }
}
