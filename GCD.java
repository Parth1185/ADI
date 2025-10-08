public class GCD {
    public static int fun(int a,int b){
        if(a==0) return b;
        return fun(b%a,a);
    }
    public static void main(String[] args) {
        System.out.println("GCD : " + fun(18,12));
        System.out.println("LCM : " + 12*18/fun(18,12));
    }
}
