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
      int border; 
      int answer;
      do { 
        border = getBoundary();
        answer = computeSSQ(border);
        printf("The result of the squares from 0 to %d is %d\n", border, answer);
      }while (again());
     
      return 0;

} 


