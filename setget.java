public class setget {
   private int hiiiii;  private int buy;
     public int getHiiiii() {
    return hiiiii;
}
   public void setHiiiii(int hiiiii) {
    this.hiiiii = hiiiii;
   }
   public int getBuy() {
    return buy;
   }
   public void setBuy(int buy) {
    this.buy = buy;
   }
     public static void main(String[] args) {
    setget haa = new setget();
    haa.setBuy(1000);
        haa.setHiiiii(232222);
        System.out.println(haa.getBuy());
        System.out.println(haa.getHiiiii());

    
    }
}