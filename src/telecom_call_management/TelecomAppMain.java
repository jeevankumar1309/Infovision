package telecom_call_management;

import java.util.*;

public class TelecomAppMain {
    public static void main(String[] args) throws InterruptedException {

        User userOne = new User("U001", "Jeevan");
        userOne.setSubscriptionPlan(PlanFactoryProvider.getSubscriptionPlan("prepaid"));

        User userTwo = new User("U002", "kumar");
        userTwo.setSubscriptionPlan(PlanFactoryProvider.getSubscriptionPlan("postpaid"));

        CallSession sessionOne = new CallSession(userOne, userTwo);
        CallSession sessionTwo = new CallSession(userTwo, userOne);

        Thread simulatorOne = new Thread(new CallSimulatorTask(sessionOne));
        Thread simulatorTwo = new Thread(new CallSimulatorTask(sessionTwo));

        simulatorOne.start();
        simulatorTwo.start();

        simulatorOne.join();
        simulatorTwo.join();

        Map<User, List<CallHistoryEntry>> userCallMap = new HashMap<>();
        userCallMap.put(userOne, new ArrayList<>());
        userCallMap.put(userTwo, new ArrayList<>());

        CallCostCalculator billingEngine = CallCostCalculator.getInstance();

        userCallMap.get(userOne).add(new CallHistoryEntry(sessionOne, billingEngine.computeCallCharge(sessionOne)));
        userCallMap.get(userTwo).add(new CallHistoryEntry(sessionTwo, billingEngine.computeCallCharge(sessionTwo)));

        billingEngine.printUserBill(userOne, userCallMap);
        billingEngine.printUserBill(userTwo, userCallMap);
    }
}

