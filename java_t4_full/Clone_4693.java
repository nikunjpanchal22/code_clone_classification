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
            loop(balance, 10);
            loop(balance, 1);
        }
        public void loop(int balance, int num){
            while(balance >= num){
                System.out.println("Balance: £"+balance);
                balance -= num;
            }
}


