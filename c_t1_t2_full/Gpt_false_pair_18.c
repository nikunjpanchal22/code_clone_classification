int main () {
    int i = 1, fibonacci = 1;
    do {
        printf ("The %2dst Fibonacci number is %3d\n", i, fibonacci);
        fibonacci = Fibonacci (++i);
    }
    while (fibonacci <= 100);
    return 0;
}


int main() {
    int i = 1, fac = 1;
    do {
        printf("The %2dst Factorial number is %3d\n", i, fac);
        fac = Factorial (++i);
    }
    while (fac <= 100);
    return 0;
}
