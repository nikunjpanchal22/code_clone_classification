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
        if(balance>=10){
            refund(balance, 10);
        }
        if(balance>=1){
            refund(balance, 1);
        }
    }
    public void refund(int balance, int decr){
        while(balance>=decr){
            System.out.println("Balance: £"+balance);
            balance -= decr;
        }
}


