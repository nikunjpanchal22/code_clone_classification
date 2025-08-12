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
            while(balance >= 10){
                printBal(balance);
                balance -= 10;
            }
            while(balance >= 0){
                printBal(balance);
                balance -= 1;
            }
        }
        public void printBal(int balance){
            System.out.println("Balance: £"+balance);
}


