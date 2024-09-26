import java.util.*;

public class rand
{
    public static void main(String[] args) 
    {
        Random Rm=new Random();

        int OTP=Rm.nextInt(1000,9999);

        System.out.println("your otp is="+OTP);
    }
    
}
