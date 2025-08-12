int main () {
    while (1) {
        primeIndex = 0;
        compositeIndex = 0;
        tempIndex = 0;
        initializeArrays ();
        compositeFactors[0] = getNumberToFactor ();
        cout << "\n\n";
        if (compositeFactors[0] == 0)
            return 0;
        numberOfCompositeFactors = 1;
        factorComposites ();
    }
}




pp
int main () {
    for(;;) {
        int primeIndex = compositeIndex = tempIndex = 0;
        initializeArrays ();
        compositeFactors[0] = getNumberToFactor (); 

        if (compositeFactors[0] > 0) {
            numberOfCompositeFactors = 1;
            factorComposites ();
            cout << "\n\n";
        } else {
            exit(0);
        }
    }
}


