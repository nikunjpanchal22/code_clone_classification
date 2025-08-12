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
    double result = this.amount;
    if (Objects.nonNull(this.subAccounts)) 
        for (Balance subAccount : this.subAccounts)
            result += subAccount.getSum();
    return result;
}


