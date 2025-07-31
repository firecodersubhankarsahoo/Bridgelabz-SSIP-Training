import java.util.*;
import java.time.*;

class Policy {
    String policyNumber;
    String policyHolder;
    LocalDate expiryDate;
    public Policy(String policyNumber, String policyHolder, LocalDate expiryDate) {
        this.policyNumber = policyNumber;
        this.policyHolder = policyHolder;
        this.expiryDate = expiryDate;
    }
    public String toString() {
        return policyNumber + ", " + policyHolder + ", Expiry: " + expiryDate;
    }
}

public class InsurancePolicyManagerDemo {
    // HashMap: policyNumber -> Policy
    private Map<String, Policy> policyMap = new HashMap<>();
    // LinkedHashMap: maintains insertion order
    private Map<String, Policy> orderedPolicyMap = new LinkedHashMap<>();
    // TreeMap: sorted by expiry date
    private TreeMap<LocalDate, List<Policy>> expiryPolicyMap = new TreeMap<>();

    // Add a policy
    public void addPolicy(Policy policy) {
        policyMap.put(policy.policyNumber, policy);
        orderedPolicyMap.put(policy.policyNumber, policy);
        expiryPolicyMap.computeIfAbsent(policy.expiryDate, k -> new ArrayList<>()).add(policy);
    }

    // Retrieve by policy number
    public Policy getPolicyByNumber(String policyNumber) {
        return policyMap.get(policyNumber);
    }

    // List all policies expiring within next 30 days
    public List<Policy> getPoliciesExpiringSoon() {
        List<Policy> result = new ArrayList<>();
        LocalDate now = LocalDate.now();
        LocalDate soon = now.plusDays(30);
        for (Map.Entry<LocalDate, List<Policy>> entry : expiryPolicyMap.subMap(now, true, soon, true).entrySet()) {
            result.addAll(entry.getValue());
        }
        return result;
    }

    // List all policies for a specific policyholder
    public List<Policy> getPoliciesByHolder(String holder) {
        List<Policy> result = new ArrayList<>();
        for (Policy p : policyMap.values()) {
            if (p.policyHolder.equalsIgnoreCase(holder)) {
                result.add(p);
            }
        }
        return result;
    }

    // Remove expired policies
    public void removeExpiredPolicies() {
        LocalDate now = LocalDate.now();
        Iterator<Map.Entry<String, Policy>> it = policyMap.entrySet().iterator();
        while (it.hasNext()) {
            Policy p = it.next().getValue();
            if (p.expiryDate.isBefore(now)) {
                it.remove();
                orderedPolicyMap.remove(p.policyNumber);
                List<Policy> list = expiryPolicyMap.get(p.expiryDate);
                if (list != null) {
                    list.remove(p);
                    if (list.isEmpty()) expiryPolicyMap.remove(p.expiryDate);
                }
            }
        }
    }

    // Demo
    public static void main(String[] args) {
        InsurancePolicyManagerDemo manager = new InsurancePolicyManagerDemo();
        manager.addPolicy(new Policy("P1001", "Alice", LocalDate.now().plusDays(10)));
        manager.addPolicy(new Policy("P1002", "Bob", LocalDate.now().plusDays(40)));
        manager.addPolicy(new Policy("P1003", "Alice", LocalDate.now().minusDays(5)));
        manager.addPolicy(new Policy("P1004", "Carol", LocalDate.now().plusDays(25)));

        System.out.println("Policy by number P1002: " + manager.getPolicyByNumber("P1002"));
        System.out.println("Policies expiring in next 30 days: " + manager.getPoliciesExpiringSoon());
        System.out.println("Policies for Alice: " + manager.getPoliciesByHolder("Alice"));
        manager.removeExpiredPolicies();
        System.out.println("All policies after removing expired:");
        for (Policy p : manager.policyMap.values()) {
            System.out.println(p);
        }
    }
}

