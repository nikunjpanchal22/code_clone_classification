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
    for(int i=balance;i>=0;i-=10)
    {
        if(i>=10)
            System.out.println("Balance: "+i);
    }
    for(int i=balance;i>0;i--)
    {
        System.out.println("Balance: "+i);
    }

}


