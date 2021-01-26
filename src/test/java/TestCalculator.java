import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Random;

public class TestCalculator {

    Random random = new Random();

    @Test
    public void testCalculateMonthPayment() {

        CreditCalculator creditCalculator = new CreditCalculator();

        int generalAmount = random.nextInt(1_000_000) + 1_000;
        int creditTime = random.nextInt(36) + 1;
        int procent = random.nextInt(100) + 1;

        int expectedMonathlyPayment = (generalAmount + (generalAmount * procent * creditTime) / 100) /
                creditTime;

        int monathlyPayment = creditCalculator.calculateMonthPayment(generalAmount,creditTime, procent);

        Assertions.assertEquals(expectedMonathlyPayment, monathlyPayment);
    }

    @Test
    public void testSumPayment() {

        CreditCalculator creditCalculator = new CreditCalculator();

        int generalAmount = random.nextInt(1_000_000) + 1_000;
        int creditTime = random.nextInt(36) + 1;
        int procent = random.nextInt(100) + 1;

        int expectedGeneralSum = generalAmount + (generalAmount * procent * creditTime) / 100;

        int generalSum = creditCalculator.calculateGeneralSum(generalAmount, creditTime, procent);

        Assertions.assertEquals(expectedGeneralSum, generalSum);
    }

    @Test
    public void testOverPayment() {

        CreditCalculator creditCalculator = new CreditCalculator();

        int generalAmount = random.nextInt(1_000_000) + 1_000;
        int creditTime = random.nextInt(36) + 1;
        int procent = random.nextInt(100) + 1;

        int expectedOverPayment = (generalAmount * procent * creditTime) / 100;

        int overPayment = creditCalculator.calculateOverPayment(generalAmount, creditTime, procent);

        Assertions.assertEquals(expectedOverPayment, overPayment);
    }
}