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


 int main() {
    while (true) {
        int primeIndex, compositeIndex, tempIndex;
        int compositeFactors[], primeFactors[];
        int numberToFactor = getNumberToFactor();
        cout << "\n\n";
        if (numberToFactor == 0)
            return 0;
        int numberOfCompositeFactors = 1;
        compositeFactors[0] = numberToFactor;
        factorComposites(compositeFactors, primeFactors,
                         numberOfCompositeFactors, primeIndex,
                         compositeIndex, tempIndex);
    }
}


