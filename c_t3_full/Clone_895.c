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
    int primeIndex, compositeIndex, tempIndex;
    int compositeFactors[], primeFactors[];
    int numberOfCompositeFactors;
    while (true) { 
        primeIndex = 0;
        compositeIndex = 0;
        tempIndex = 0;
        initializeArrays ();
        compositeFactors[0] = getNumberToFactor ();
        cout << "\n\n";
        numberOfCompositeFactors = 1;
        if (compositeFactors[0] == 0) 
            return 0;
        factorComposites (compositeFactors, primeFactors, 
            numberOfCompositeFactors, primeIndex, compositeIndex,
            tempIndex);
    }
}


