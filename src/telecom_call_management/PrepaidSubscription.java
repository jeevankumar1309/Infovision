package telecom_call_management;



class PrepaidSubscription implements SubscriptionPlan {
    @Override
    public double getPerMinuteRate() {
        return 0.5;
    }
}

