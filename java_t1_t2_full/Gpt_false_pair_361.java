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
                result += sum(subAccount);
            }
        }
        return result;
       }

    public double sum(Balance account) {
        double result = account.amount;
        if (account.subAccounts != null) {
            for (Balance subAccount : account.subAccounts) {
                result += sum(subAccount);
            }
        }
        return result;
}
