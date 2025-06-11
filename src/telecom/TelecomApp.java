package telecom;

public class TelecomApp {
	
    public static void main(String[] args) {
    	
        TelecomService sms = new SMSService(1.5);        // ₹1.5 per SMS
        TelecomService voice = new VoiceCallService(2.0);// ₹2.0 per minute

        runService(sms, 10);
        runService(voice, 5);
        
        Recharge recharge = new Recharge();
        //recharge.voicePack(105.2f);
        recharge.voicePack(80,105.2f);
        
        PlanLimit planlimit = new InternetLimit();
        planlimit.checkLimit();
        
        
        
    }

    private static void runService(TelecomService service, int units) {
        service.start();
        service.billCustomer(units);
        service.stop();
        System.out.println();
    }
}
