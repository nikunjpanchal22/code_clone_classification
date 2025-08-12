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
    int i = 1, sqrt = 1;
    do {
        printf ("The %2dst square root number is %3d\n", i, sqrt);
        sqrt = sqrt(i);
        ++i;
    }
    while (sqrt <= 100);
    return 0;
}
