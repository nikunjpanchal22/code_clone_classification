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
    int i = 1, div = 1;
    do {
        printf ("The %2dst division number is %3d\n", i, div);
        div = div/i;
        ++i;
    }
    while (div <= 100);
    return 0;
}
