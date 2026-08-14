import java.util.Scanner;
public class PalinDrome {
    public boolean isPalin(String str){
String s = "";
for(int i=str.length()-1;i>=0;i--)
{
    s=s+str.charAt(i);
}
if(s.equalsIgnoreCase(str)){
    return true;
}else{
    return false;
}
    }
    public static void main(String args [])
    {
        String hi;
    Scanner sn = new Scanner(System.in);
    System.out.println("enter a strng");
    hi= sn.nextLine();
    PalinDrome r1 = new PalinDrome();
    System.out.println(r1.isPalin(hi));
    sn.close();
    }

    }

