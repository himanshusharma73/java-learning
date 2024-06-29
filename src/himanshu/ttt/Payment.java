package himanshu.ttt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Payment class blueprint
public class Payment {

    List<Transaction> transactions = new ArrayList<>();

    {
        transactions.add(new Transaction(1, 100, 200, TransactionType.P2M));
        transactions.add(new Transaction(2, 200, 300, TransactionType.P2M));
        transactions.add(new Transaction(3, 100, 400, TransactionType.P2M));
        transactions.add(new Transaction(4, 300, 100, TransactionType.P2M));
        transactions.add(new Transaction(5, 200, 300, TransactionType.P2M));
        transactions.add(new Transaction(6, 400, 100, TransactionType.P2M));
        transactions.add(new Transaction(7, 100, 200, TransactionType.P2M));
        transactions.add(new Transaction(8, 100, 400, TransactionType.P2M));
    }
    public TransactionSummary makePayment(int transactionId, int senderId, int amount, TransactionType transactionType) {
        if (transactionType==TransactionType.P2M){
            int number=getNumberOfTransactions(senderId,transactionType);
            if (number>=5){
                return new TransactionSummary(senderId,true);
            }
        }
        return new TransactionSummary(senderId,false);
    }
    

    public int getNumberOfTransactions(int senderId, TransactionType transactionType) {
        List<Transaction> transactionStream = transactions
                .stream()
                .filter(transaction -> transaction.getSenderId() == senderId).collect(Collectors.toList());
        return transactionStream.size();
    }
}