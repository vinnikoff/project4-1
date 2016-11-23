/**
 * Created by VINNI on 23.11.16.
 */
public class ChinaBank extends Bank {
    @Override
    int getLimitOfWithdrawal(){
        return 0;
    }
    @Override
    int getLimitOfFunding(){
        return 0;
    }
    @Override
    int getMonthlyRate(){
        return 0;
    }
    @Override
    int getCommission(int summ){
        return 0;
    }
}
