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
     int cutoff;
     int res;
     do {
        cutoff = getBoundary();
        res = computeSSQ(cutoff);
        printf("The sum of the squares from 0 to %d is %d\n", cutoff, res);
     }while (again());
    
     return 0;
}


