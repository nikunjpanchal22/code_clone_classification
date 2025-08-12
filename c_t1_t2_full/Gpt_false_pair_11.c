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
    int i = 1, sine = 1;
    do {
        printf ("The %2dst sine number is %3d\n", i, sine);
        sine = sin(i);
        ++i;
    }
    while (sine <= 100);
    return 0;
}
