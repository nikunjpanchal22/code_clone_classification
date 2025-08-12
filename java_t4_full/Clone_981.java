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
    while (balance > 0) { 
        int amount = Math.min(10, balance); 
        balance-=amount; 
        System.out.println("Balance: " + balance); 
    } 
}


