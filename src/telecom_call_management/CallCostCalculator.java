package telecom_call_management;

import java.util.List;
import java.util.Map;

class CallCostCalculator {
    private static CallCostCalculator singletonInstance;

    CallCostCalculator() {}

    public static CallCostCalculator getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new CallCostCalculator();
        }
        return singletonInstance;
    }

    public double computeCallCharge(CallSession session) {
        double ratePerMinute = session.getInitiator().getSubscriptionPlan().getPerMinuteRate();
        double durationInMinutes = session.getCallDurationInSeconds() / 60.0;
        return ratePerMinute * durationInMinutes;
    }

    public void printUserBill(User user, Map<User, List<CallHistoryEntry>> userCallMap) {
        List<CallHistoryEntry> userLogs = userCallMap.get(user);
        double totalCharges = 0;
        for (CallHistoryEntry entry : userLogs) {
            totalCharges += entry.getCallCharge();
        }
        System.out.println("Invoice for " + user.getUserName() + ": ₹" + totalCharges);
    }
}

