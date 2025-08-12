int main () {
    int i = 1, fibonacci = 1;
    do {
        printf ("The %2dst Fibonacci number is %3d\n", i, fibonacci);
        fibonacci = Fibonacci (++i);
    }
    while (fibonacci <= 100);
    return 0;
}


 
int main () {
    int i = 1, absVal = 1;
    do {
        printf ("The %2dst absolute value number is %3d\n", i, absVal);
        absVal = abs(i);
        ++i;
    }
    while (absVal <= 100);
    return 0;
}
