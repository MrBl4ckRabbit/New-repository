package task_3;

import java.util.*;
import java.util.stream.Collectors;

public class PuttingIntoPractice {

    public static void main(String... args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        System.out.println("*******  1.Sorting by years  *******");
        List<Transaction> transactions2011 = transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .toList();
        for (Transaction transaction : transactions2011) {
            System.out.println(transaction);
        }
        System.out.println();
        System.out.println("*******  The another way  *******");
        transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .forEach(System.out::println);
        System.out.println();
        System.out.println("*******  2.Finding only unique cities *******");

        Set<String> cities = transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .collect(Collectors.toSet());
        cities.forEach(System.out::println);

        System.out.println();
        System.out.println("*******  The another way  *******");
        List<String> cities1 = transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .toList();

        cities1.forEach(System.out::println);
        System.out.println();

        System.out.println("*******  3.Finding all traders from Cambridge *******");

        List<Trader> tradersFromCambridge = transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> "Cambridge".equals(trader.getCity()))
                .distinct()
                .sorted(Comparator.comparing(Trader::getName))
                .toList();

        tradersFromCambridge.forEach(System.out::println);
        System.out.println();

        System.out.println("*******  4.Sorting all traders by name  *******");

        List<String> tradersName = transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .toList();

        tradersName.forEach(System.out::println);
        System.out.println();

        System.out.println("*******  5.Finding all traders from Milan  *******");
        boolean isTraderFromMilanExists = transactions.stream()
                .anyMatch(transaction -> "Milan".equals(transaction.getTrader().getCity()));

        System.out.println(isTraderFromMilanExists ? "Yes,there's a trader from Milan" :
                "No,there isn't a trader from Milan");
        System.out.println();

        System.out.println("*******  6.Sum of all transactions from Cambridge  *******");

        int sumOfAllTransactionsFromCambridge = transactions.stream()
                .filter(transaction -> "Cambridge".equals(transaction.getTrader().getCity()))
                .mapToInt(Transaction::getValue)
                .sum();
        System.out.println("Sum of all transactions from Cambridge is: " + sumOfAllTransactionsFromCambridge);
        System.out.println();

        System.out.println("*******  7.Max Sum among all transactions  *******");

        Optional<Transaction> maxTransactionValue = transactions.stream()
                .max(Comparator.comparing(Transaction::getValue));

        if (maxTransactionValue.isPresent()) {
            System.out.println("Max Sum among all transactions is: " + maxTransactionValue.get());
        } else {
            System.out.println("The list of transactions is empty");
        }
        System.out.println();
        
        System.out.println("*******  8.Transaction with min sum *******");

        Optional<Transaction> minTransaction = transactions.stream()
                .min(Comparator.comparing(Transaction::getValue));

        if (minTransaction.isPresent()) {
            System.out.println("Transaction with min sum is: " + minTransaction.get());
        } else {
            System.out.println("The list of transactions is empty");
        }
    }
}
