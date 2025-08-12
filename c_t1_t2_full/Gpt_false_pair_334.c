int main (void) {
    myPortfolio.balance = 12.34;
    myPortfolio.myStocks[3].shares = 111.222;
    printf ("My portfolio balance is %lf", myPortfolio.balance);
    for (int i = 0; i < (MAX_MY_STOCKS + 1); i++) {
        PrintPortfolio (i);
    }
    printf ("\n\n\n Lets use a pointer!");
    Portfolio *pmyPortfolio;
    pmyPortfolio = &myPortfolio;
    printf ("\n\nMy portfolio balance is %lf", pmyPortfolio -> balance);
    return 0;
}


 int main (void) {
    myPortfolio.balance = 12.34;
    myPortfolio.myStocks[3].shares = 111.222;
    printf ("My portfolio balance is %lf\n\n\n", myPortfolio.balance);

    for (int i = 0; i < MAX_MY_STOCKS + 1; i++) {
        printf ("=========================");
        PrintPortfolio (i);
        printf ("------------------------\n");
    }

    printf ("\n\n\n Let's use a pointer!");
    Portfolio *pmyPortfolio;
    pmyPortfolio = &myPortfolio;
    printf ("My portfolio balance is %lf", pmyPortfolio -> balance);
    return 0;
}
