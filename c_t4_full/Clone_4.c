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
    int i = 1;
    int fibonacci = 1;
    for (fibonacci = 0; fibonacci < 100; fibonacci = Fibonacci(++i)) {
        printf ("The %2dst Fibonacci number is %3d\n", i, fibonacci);
    }
    return 0;
}


