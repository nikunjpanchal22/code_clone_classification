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


 int main () {
    while (1) {
        int primeIndex = 0;
        int compositeIndex = 0;
        int tempIndex = 0;
        int compositeFactors[], primeFactors[];
        int numberToFactor = getNumberToFactor();
        if (numberToFactor == 0)
            return 0;
        cout << "\n\n";
        compositeFactors[0] = numberToFactor;
        int numberOfCompositeFactors = 1;
        initializeArrays();
        factorComposites (compositeFactors, primeFactors, 
            numberOfCompositeFactors, primeIndex, compositeIndex,
            tempIndex);
    }
}


