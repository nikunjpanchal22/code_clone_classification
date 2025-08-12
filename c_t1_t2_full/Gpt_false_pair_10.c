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
    int i = 1, log = 1;
    do {
        printf ("The %2dst logarithmic number is %3d\n", i, log);
        log = log(i);
        ++i;
    }
    while (log <= 100);
    return 0;
}
