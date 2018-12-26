package Lesson6;

public class ConnectionRetryAccount implements Account {
    private final Account account;
    private final int retries;

    public ConnectionRetryAccount(Account account, int retries) {
        this.account = account;
        this.retries = retries;
    }

    public Account getAccount() {
        return account;
    }

    public int getRetries() {
        return retries;
    }

    @Override
    public void withdraw(long money) throws AccountException {
        for (int i = 0; i < retries; i++) {
            System.out.println("Попытка №" + (i + 1));
            try {
                account.withdraw(money);
                System.out.println("Деньги сняты");
                break;
            } catch (NotEnoughFundsException e) {
                System.out.println("NotEnoughFundsException" + e);
                break;
            } catch (AccountExpiredException e) {
                System.out.println("AccountExpiredException" + e);
                break;
            } catch (AccountConnectionException e) {
                System.out.println("AccountConnectionException" + e);
            } finally {
                System.out.println("----------------------");
                if (i + 1 == retries) {
                    System.out.println("Конец связи");
                }
            }

        }
    }
}
