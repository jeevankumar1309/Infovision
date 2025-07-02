package callRecords_Analyzer;




import java.time.LocalDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TelecomAnalyzer {

    private List<CallRecord> callRecords;

    public TelecomAnalyzer() {
        this.callRecords = new ArrayList<>();
    }

    public void addCallRecord(CallRecord record) {
        callRecords.add(record);
    }

    public long getTotalCallDuration(String caller) {
        return callRecords.stream()
                .filter(record -> record.getCaller().equalsIgnoreCase(caller))
                .mapToLong(CallRecord::getDuration)
                .sum();
    }

    public Optional<CallRecord> getLongestCall() {
        return callRecords.stream()
                .max(Comparator.comparingLong(CallRecord::getDuration));
    }

    public List<CallRecord> getCallsSortedByDuration() {
        return callRecords.stream()
                .sorted(Comparator.comparingLong(CallRecord::getDuration).reversed())
                .collect(Collectors.toList());
    }

    public List<CallRecord> getCallsByOperator(String operator) {
        return callRecords.stream()
                .filter(record -> record.getOperator().equalsIgnoreCase(operator))
                .collect(Collectors.toList());
    }

    public Map<String, List<CallRecord>> groupCallsByOperator() {
        return callRecords.stream()
                .collect(Collectors.groupingBy(CallRecord::getOperator));
    }

    public Map<String, List<CallRecord>> groupCallsByLocation() {
        return callRecords.stream()
                .collect(Collectors.groupingBy(CallRecord::getLocation));
    }

    public Map<String, Long> getFrequentCallers() {
        return callRecords.stream()
                .collect(Collectors.groupingBy(CallRecord::getCaller, Collectors.counting()));
    }

    public void printAllRecords() {
        if (callRecords.isEmpty()) {
            System.out.println("No call records found.");
        } else {
            callRecords.forEach(System.out::println);
        }
    }

    public void printSummary() {
        System.out.println("Total calls in the records: " + callRecords.size());
        getLongestCall().ifPresent(call -> 
            System.out.println("Longest call: " + call));
        System.out.println("Total call duration for 'John': " + getTotalCallDuration("John") + " seconds");
    }
}
