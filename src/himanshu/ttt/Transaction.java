package himanshu.ttt;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
class Transaction {
    private int transactionId;
    private int senderId;
    private int amount;
    private TransactionType transactionType;

}