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
                result += accumulate(subAccount, result);
            }
        }
        return result;
    }

    public double accumulate(Balance account, double accumulated) {
        accumulated += account.amount;
        if (account.subAccounts != null) {
            for (Balance subAccount : account.subAccounts) {
                accumulated += accumulate(subAccount, accumulated);
            }
        }
        return accumulated;
}
