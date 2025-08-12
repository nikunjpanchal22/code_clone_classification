public double getSum () {
    double result = this.amount;
    if (this.subAccounts != null) {
        for (Balance subAccount : this.subAccounts) {
            result = result + subAccount.getSum ();
        }
    }
    return result;
}




public double getSum() {
    double result = amount;
    if (subAccounts != null) 
        result += subAccounts.stream().mapToDouble(Balance::getSum).sum();
    return result;
}


