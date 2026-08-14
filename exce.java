public class exce {
    public static void main(String[] args) {
        
    int a=1000; int b=10;
    try {
        int c = a/b;
        System.err.println(c);
    } catch (Exception e) {
        System.err.println("there is exception");
        System.out.println(e);
    }
    System.out.println("BYE BYE");
    }
}