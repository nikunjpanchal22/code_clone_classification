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
    if (balance >= 10) {
        for (int i=balance; i>=10; i-=10) {
            System.out.println ("Balance: " + i);
        }
    }
    while (balance > 0) {
        System.out.println ("Balance: " + balance);
        balance--;
    }
}


