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
        int candidateToFactor,primeIndex, compositeIndex,tempIndex; 
        int compositeFactors[], primeFactors[];
        int numberOfCompositeFactors;
        initializeArrays();
        candidateToFactor = getNumberToFactor();
        cout << endl;
        if (candidateToFactor == 0){
            return 0;
        }
        compositeFactors[0] = candidateToFactor;
        numberOfCompositeFactors = 1 ;
        factorComposites(compositeFactors, primeFactors,
                         numberOfCompositeFactors, primeIndex,
                         compositeIndex, tempIndex);
    }
}


