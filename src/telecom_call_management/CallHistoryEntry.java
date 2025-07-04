package telecom_call_management;



class CallHistoryEntry {
    private CallSession session;
    private double callCharge;

    public CallHistoryEntry(CallSession session, double callCharge) {
        this.session = session;
        this.callCharge = callCharge;
    }

    public double getCallCharge() {
        return callCharge;
    }

    public CallSession getSession() {
        return session;
    }
}

