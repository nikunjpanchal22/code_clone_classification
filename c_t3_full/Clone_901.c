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
    int limit;
    int sum;
    do {
        limit = getBoundary();
        sum = computeSSQ(limit);
        printf("The result of the squares from 0 to %d is %d\n", limit, sum);
    }while (again());
    
    return 0;
} 


