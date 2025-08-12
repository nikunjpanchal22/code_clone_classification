public void refund (int balance) {
    while (balance >= 10) {
        System.out.println ("Balance: " + balance);
        balance -= 10;
    }
    while (balance >= 0) {
        System.out.println ("Balance: " + balance);
        balance -= 1;
    }
}


  public void refund (int balance) {
   while (balance >= 10) { 
        int maxRefund = balance - 10; 
        System.out.println("Balance: " + maxRefund);
        balance -= 10; 
   }
   for (int i=balance; i>=0; i-=1) {
    System.out.println("Balance: " + i);
   }
}


