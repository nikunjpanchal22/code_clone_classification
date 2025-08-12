int main (void) {
    do {
        int boundary = getBoundary ();
        int ssq = computeSSQ (boundary);
        printf ("The sum of the squares of integers from 0 to %d is %d\n", boundary, ssq);
    }
    while (again ());
    return 0;
}


  int main(void) {
    int termination;
    int output;
    do {
        termination = getBoundary();
        output = computeSSQ(termination);
        printf("The sum of the squares from 0 to %d is %d\n", termination, output);
    }while (again());
    
    return 0;
}  

  int main(void) {
    int boundary;
    int summation;
    do {
        boundary = getBoundary();
        summation = computeSSQ(boundary);
        printf("The sum of the squares from 0 to %d is %d\n", boundary, summation);
    }while (again());
    
    return 0;
} 


