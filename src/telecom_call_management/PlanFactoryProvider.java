package telecom_call_management;



class PlanFactoryProvider {
    public static SubscriptionPlan getSubscriptionPlan(String type) {
        if ("prepaid".equalsIgnoreCase(type)) {
            return new PrepaidSubscription();
        } else if ("postpaid".equalsIgnoreCase(type)) {
            return new PostpaidSubscription();
        }
        return null;
    }
}
