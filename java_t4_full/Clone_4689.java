public void refund (int balance) {
    while (balance >= 10) {
        System.out.println ("Balance: £" + balance);
        balance -= 10;
    }
    while (balance >= 0) {
        System.out.println ("Balance: £" + balance);
        balance -= 1;
    }
}





public void refund(int balance) {
            balance = refund(balance, 10);
            refund(balance, 1);
        }
        private int refund(int balance, int decrease) {
            while (balance >=decrease) {
                System.out.println("Balance: £" + balance);
                balance -= decrease;
            }
            return balance;
}


