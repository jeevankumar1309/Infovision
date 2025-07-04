package telecom_call_management;



class PostpaidSubscription implements SubscriptionPlan {
    @Override
    public double getPerMinuteRate() {
        return 1.0;
    }
}

