package callRecords_Analyzer;

import java.time.LocalDateTime;


public class CallRecord {
    private String caller;        
    private String receiver;     
    private long duration;        
    private String operator;      
    private String location;      
    private LocalDateTime timestamp;  

    
    public CallRecord(String caller, String receiver, long duration, String operator, String location, LocalDateTime timestamp) {
        this.caller = caller;
        this.receiver = receiver;
        this.duration = duration;
        this.operator = operator;
        this.location = location;
        this.timestamp = timestamp;
    }

    public String getCaller() {
        return caller;
    }

    public String getReceiver() {
        return receiver;
    }

    public long getDuration() {
        return duration;
    }

    public String getOperator() {
        return operator;
    }

    public String getLocation() {
        return location;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    
    @Override
    public String toString() {
        return String.format("Call from %s to %s | Duration: %d sec | Operator: %s | Location: %s | Time: %s",
                caller, receiver, duration, operator, location, timestamp);
    }
}

