public class CreditCalculator {

    public int calculateMonthPayment(int generalAmount, int creditTime, int procent) {
        return (generalAmount + (generalAmount * procent * creditTime) / 100) /
                creditTime;
    }

    public int calculateGeneralSum(int generalAmount, int creditTime, int procent) {
        return generalAmount + (generalAmount * procent * creditTime) / 100;
    }

    public int calculateOverPayment(int generalAmount, int creditTime, int procent) {
        return (generalAmount * procent * creditTime) / 100;
    }

}