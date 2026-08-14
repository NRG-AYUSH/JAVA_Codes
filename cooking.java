
// 1. CookingTask extending Thread
class CookingTask extends Thread {
    
    // Constructor passing thread name to Thread superclass
    public CookingTask(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("[" + Thread.currentThread().getName() + "] The chef started cooking the food...");
        try {
            Thread.sleep(3000); // Sleeping for 3000 ms
        } catch (InterruptedException e) {
            System.err.println("The thread woke up unexpectedly!");
        }
        System.out.println("[" + Thread.currentThread().getName() + "] The chef has finished cooking your order! 🍔");
    }
} 

// 2. PackingTask implementing Runnable
class PackingTask implements Runnable {
    @Override
    public void run() {
        System.out.println("[" + Thread.currentThread().getName() + "] Your food is being packed into box... 📦");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.err.println("Woke up unexpectedly!");
        }
        System.out.println("[" + Thread.currentThread().getName() + "] Food is ready to be delivered!");
    }
}

// 3. Main Class with execution flow
public class cooking {
    public static void main(String[] args) {
        try {
            // A. Create & start Chef Thread (using Thread class)
            CookingTask chefThread = new CookingTask("Chef-Thread");
            chefThread.start();
            
            // Wait for chefThread to finish cooking BEFORE moving to packing
            chefThread.join(); 

            // B. Create & start Packer Thread (using Runnable + Thread(Runnable, String) constructor)
            PackingTask packingTask = new PackingTask();
            Thread packerThread = new Thread(packingTask, "Packer-Thread");
            packerThread.start();
            
            // Wait for packerThread to finish packing BEFORE starting delivery
            packerThread.join(); 

            // C. Delivery Thread using Lambda + Thread(Runnable, String) constructor
            Runnable deliveryLogic = () -> {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("[" + Thread.currentThread().getName() + "] Agent on the way... 🛵 (" + i + "/3)");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.err.println("Delivery interrupted!");
                    }
                }
            };

            Thread deliveryThread = new Thread(deliveryLogic, "Delivery-Thread");
            deliveryThread.start();

        } catch (InterruptedException e) {
            System.err.println("Main thread interrupted!");
        }
    }
}