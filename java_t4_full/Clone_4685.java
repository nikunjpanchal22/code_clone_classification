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
            reduceBal(balance, 10);
            reduceBal(balance, 1);
        }
        public void reduceBal(int balance, int decr){
            while(balance>=decr){
                System.out.println("Balance: £"+balance);
                balance -= decr;
            }   
}


