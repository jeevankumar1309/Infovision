package telecom_call_management;



class User {
    private String userId;
    private String userName;
    private SubscriptionPlan subscriptionPlan;

    public User(String userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setSubscriptionPlan(SubscriptionPlan plan) {
        this.subscriptionPlan = plan;
    }

    public SubscriptionPlan getSubscriptionPlan() {
        return subscriptionPlan;
    }
}

