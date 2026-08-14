

class AgeExeception extends Exception {
    public AgeExeception(String message) {
        super(message);
        // passes the message to the super class that is exception
    }
}

class MedicalFailedException extends RuntimeException {
    public MedicalFailedException(String message) {
        super(message);
    }
}

class LicenseService {

    public void checkEligibility(int age, boolean passedMedicalTest) throws AgeExeception {
        if (age < 18) {
            throw new AgeExeception("Your age is less the 18 ghare jaake sutti  babu license baade me lena");
        }
        if (passedMedicalTest == false) {
            throw new MedicalFailedException(
                    "Bhakk tum gaadi nahi chala skte wo baat alag hai bina license ke chalalo lekin license nhi denge tumhe");
        } else {
            System.out.println("Making the license please wait");
        }

    }
}
public class RTO{
    public static void main(String args[]){
        LicenseService service = new LicenseService();
        try{
            service.checkEligibility(19,false);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("License service check completed");
        }
    }
}