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





public void refund(int balance){
            balance = decr(balance, 10);
            decr(balance, 1);
        }
        public int decr(int balance, int decrement){
            while(balance >= decrement){
                System.out.println("Balance: £"+ balance);
                balance -= decrement;
            }
            return balance;
}


