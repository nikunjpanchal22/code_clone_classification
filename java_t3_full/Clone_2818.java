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
    do{
        System.out.println("Balance: £" + balance);
        balance -= 10;
    } while(balance>=10);
    do{
        System.out.println("Balance: £" + balance);
        balance -= 1;
    } while(balance>=0);
}


