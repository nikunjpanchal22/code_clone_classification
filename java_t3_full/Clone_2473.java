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
    if (this.subAccounts != null) {
        Iterator<Balance> iterator = this.subAccounts.iterator();
        while (iterator.hasNext())
            result += iterator.next().getSum();
    }
    return result;
}


