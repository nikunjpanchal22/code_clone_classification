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
            Iterator<Balance> itr = this.subAccounts.iterator();
            while(itr.hasNext()) {
                result += itr.next().getSum();
            }
        }
        return result;
}


