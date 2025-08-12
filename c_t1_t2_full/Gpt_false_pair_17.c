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
    int i = 1, mul = 1;
    do {
        printf ("The %2dst multiplication number is %3d\n", i, mul);
        mul *= i;
        ++i;
    }
    while (mul <= 100);
    return 0;
}
