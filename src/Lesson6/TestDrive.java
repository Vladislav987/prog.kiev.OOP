package Lesson6;

public class TestDrive {
    public static void main(String[] args) throws AccountException {
        RandomAccount a = new RandomAccount(0.2, 0.3, 0.4);
        ConnectionRetryAccount b = new ConnectionRetryAccount(a, 3);
        b.withdraw(5000);
    }
}

//Попытка №1
//0.6389647472039044
//AccountConnectionExceptionOOP.Book.AccountConnectionException: Ошибка соединения
//----------------------
//Попытка №2
//0.5025918944460236
//AccountConnectionExceptionOOP.Book.AccountConnectionException: Ошибка соединения
//----------------------
//Попытка №3
//0.7054596231047657
//AccountConnectionExceptionOOP.Book.AccountConnectionException: Ошибка соединения
//----------------------
//Конец связи

//Попытка №1
//0.16584806553784637
//NotEnoughFundsExceptionOOP.Book.NotEnoughFundsException: Недостаточно денег на счету
//----------------------

//Попытка №1
//0.692641848174024
//AccountConnectionExceptionOOP.Book.AccountConnectionException: Ошибка соединения
//----------------------
//Попытка №2
//0.999829916967983
//Деньги сняты
//----------------------