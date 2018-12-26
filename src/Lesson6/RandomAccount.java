package Lesson6;

public class RandomAccount implements Account {
    private final double notEnoughFundsProbability;
    private final double accountExpiredProbability;
    private final double lostConnectionProbability;

    public RandomAccount(double notEnoughFundsProbability, double accountExpiredProbability, double lostConnectionProbability) {
        this.notEnoughFundsProbability = notEnoughFundsProbability;
        this.accountExpiredProbability = accountExpiredProbability;
        this.lostConnectionProbability = lostConnectionProbability;
    }

    @Override
    public void withdraw(long money) throws AccountException {

        double random = Math.random();
        System.out.println(random);
        if (random >= 0 && random < notEnoughFundsProbability) {
            throw new NotEnoughFundsException("Недостаточно денег на счету ");
        }
        if (random >= notEnoughFundsProbability && random < accountExpiredProbability + notEnoughFundsProbability) {
            throw new AccountExpiredException("Срок действия счета истек");
        }
        if (random >= accountExpiredProbability + notEnoughFundsProbability && random < lostConnectionProbability + notEnoughFundsProbability + accountExpiredProbability) {
            throw new AccountConnectionException("Ошибка соединения");
        }

    }
}
