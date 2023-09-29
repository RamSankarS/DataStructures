public class RFibonocci{
    public static void main(String[] args){
        System.out.println(fibonocci(5));
    }

    static int fibonocci(int n){
        if(n < 2) return n;
        return fibonocci(n-1) + fibonocci(n-2);
    }
}