public double getSum () {
    double result = this.amount;
    if (this.subAccounts != null) {
        for (Balance subAccount : this.subAccounts) {
            result = result + subAccount.getSum ();
        }
    }
    return result;
}


 public double getSum () {
        double result = this.amount;
        if (this.subAccounts != null) {
            for (Balance subAccount : this.subAccounts) {
                result += traverse(subAccount);
            }
        }
        return result;
    }

    public double traverse(Balance account) {
        double sum = account.amount;
        if (account.subAccounts != null) {
            for (Balance subAccount : account.subAccounts) {
                sum += traverse(subAccount);
            }
        }
        return sum;
}
