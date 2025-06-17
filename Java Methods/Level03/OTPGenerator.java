public class OTPGenerator {
    public static void main(String[] args) {
        String[] otps = new String[10];
        
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println("OTP " + (i+1) + ": " + otps[i]);
        }
        
        boolean areUnique = areOTPsUnique(otps);
        System.out.println("\nAll OTPs are unique: " + areUnique);
        
        if (!areUnique) {
            System.out.println("There were duplicate OTPs generated.");
        }
    }
    
    public static String generateOTP() {
        int otp = 100000 + (int)(Math.random() * 900000); 
        return String.valueOf(otp);
    }
    
    public static boolean areOTPsUnique(String[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i].equals(otps[j])) {
                    return false;
                }
            }
        }
        return true;
    }
}