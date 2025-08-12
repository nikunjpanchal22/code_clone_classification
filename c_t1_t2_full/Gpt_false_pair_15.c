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
    int i = 1, cosine = 1;
    do {
        printf ("The %2dst cosine number is %3d\n", i, cosine);
        cosine = cos(i);
        ++i;
    }
    while (cosine <= 100);
    return 0;
}
