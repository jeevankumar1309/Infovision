package telecom_call_management;



class CallSimulatorTask implements Runnable {
    private CallSession callSession;

    public CallSimulatorTask(CallSession callSession) {
        this.callSession = callSession;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000); // simulate 1-second call
            callSession.terminateCall();
            System.out.println("Call between " + callSession.getInitiator().getUserName() +
                    " and " + callSession.getRecipient().getUserName() +
                    " lasted " + callSession.getCallDurationInSeconds() + " seconds.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

