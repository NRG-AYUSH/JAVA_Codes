import java.time.LocalDate;

public class dateshehe {
    public static void main(String args[]){
        

LocalDate today = LocalDate.now();              // Current date: 2026-08-02
LocalDate futureDate = today.plusDays(10);     // 2026-08-12
LocalDate specificDate = LocalDate.of(2026, 8, 2); // August is 8!
   System.out.println("Today: " + today);
   System.out.println("Future Date: " + futureDate);}
}
