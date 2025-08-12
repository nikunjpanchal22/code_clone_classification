int main (void) {
    do {
        int boundary = getBoundary ();
        int ssq = computeSSQ (boundary);
        printf ("The sum of the squares of integers from 0 to %d is %d\n", boundary, ssq);
    }
    while (again ());
    return 0;
}


int main (void) {
    do {
        int maximum = getMaximum ();
        int totalsq = computeTotalSQ (maximum);
        printf ("The sum of the squares of integers from 0 to %d is %d\n", maximum, totalsq);
    }
    while (wantMore());
    return 0;
}
