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
    int i = 1, sum = 1;
    do {
        printf ("The %2dst addition number is %3d\n", i, sum);
        sum += i;
        ++i;
    }
    while (sum <= 100);
    return 0;
}
