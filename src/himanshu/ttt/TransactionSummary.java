package himanshu.ttt;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TransactionSummary {


    private int transactionId;
    private boolean isSenderEligibleForReward;
    
    // Constructor
    public TransactionSummary(int transactionId, boolean isSenderEligibleForReward) {
        this.transactionId = transactionId;
        this.isSenderEligibleForReward = isSenderEligibleForReward;
    }
}
