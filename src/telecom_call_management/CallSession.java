package telecom_call_management;



class CallSession {
    private User initiator;
    private User recipient;
    private long callStart;
    private long callEnd;

    public CallSession(User initiator, User recipient) {
        this.initiator = initiator;
        this.recipient = recipient;
        this.callStart = System.currentTimeMillis();
    }

    public void terminateCall() {
        this.callEnd = System.currentTimeMillis();
    }

    public long getCallDurationInSeconds() {
        return (callEnd - callStart) / 1000;
    }

    public User getInitiator() {
        return initiator;
    }

    public User getRecipient() {
        return recipient;
    }

    public long getCallStartTime() {
        return callStart;
    }

    public long getCallEndTime() {
        return callEnd;
    }
}

