import java.util.*;

class WithdrawalRequest {
    String accountNumber;
    double amount;
    public WithdrawalRequest(String accountNumber, double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }
}

public class BankingSystemDemo {
    // HashMap: AccountNumber -> Balance
    private Map<String, Double> accountMap = new HashMap<>();
    // TreeMap: Balance -> List<AccountNumber> (sorted by balance)
    private TreeMap<Double, List<String>> sortedAccounts = new TreeMap<>();
    // Queue: Withdrawal requests
    private Queue<WithdrawalRequest> withdrawalQueue = new LinkedList<>();

    // Add account
    public void addAccount(String accountNumber, double balance) {
        accountMap.put(accountNumber, balance);
        sortedAccounts.computeIfAbsent(balance, k -> new ArrayList<>()).add(accountNumber);
    }

    // Request withdrawal
    public void requestWithdrawal(String accountNumber, double amount) {
        withdrawalQueue.add(new WithdrawalRequest(accountNumber, amount));
    }

    // Process withdrawal requests
    public void processWithdrawals() {
        while (!withdrawalQueue.isEmpty()) {
            WithdrawalRequest req = withdrawalQueue.poll();
            Double balance = accountMap.get(req.accountNumber);
            if (balance != null && balance >= req.amount) {
                // Remove old balance from sortedAccounts
                List<String> oldList = sortedAccounts.get(balance);
                oldList.remove(req.accountNumber);
                if (oldList.isEmpty()) sortedAccounts.remove(balance);
                // Update balance
                double newBalance = balance - req.amount;
                accountMap.put(req.accountNumber, newBalance);
                sortedAccounts.computeIfAbsent(newBalance, k -> new ArrayList<>()).add(req.accountNumber);
                System.out.println("Withdrawal of $" + req.amount + " from " + req.accountNumber + " successful. New balance: $" + newBalance);
            } else {
                System.out.println("Withdrawal of $" + req.amount + " from " + req.accountNumber + " failed. Insufficient funds or account not found.");
            }
        }
    }

    // Display accounts sorted by balance
    public void displaySortedAccounts() {
        System.out.println("Accounts sorted by balance:");
        for (Map.Entry<Double, List<String>> entry : sortedAccounts.entrySet()) {
            for (String acc : entry.getValue()) {
                System.out.println(acc + " - $" + entry.getKey());
            }
        }
    }

    public static void main(String[] args) {
        BankingSystemDemo bank = new BankingSystemDemo();
        bank.addAccount("ACC1001", 5000);
        bank.addAccount("ACC1002", 3000);
        bank.addAccount("ACC1003", 7000);
        bank.requestWithdrawal("ACC1001", 1000);
        bank.requestWithdrawal("ACC1002", 3500);
        bank.requestWithdrawal("ACC1003", 2000);
        bank.processWithdrawals();
        bank.displaySortedAccounts();
    }
}

