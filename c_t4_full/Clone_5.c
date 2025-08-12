int main () {
    int i = 2, fibonacci = 0, fParcialone = 1, fParcialtwo = 0;
    printf ("The %2dst Fibonacci number is %3d\n", i - 1, fibonacci + 1);
    fibonacci = fParcialone + fParcialtwo;
    do {
        printf ("The %2dst Fibonacci number is %3d\n", i, fibonacci);
        fParcialtwo = fParcialone;
        fParcialone = fibonacci;
        i++;
    }
    while ((fibonacci = fParcialone + fParcialtwo) <= 100);
    return 0;
}


 int main() {
    int a, b, c;
    c = 0;
    a = 1;
    b = 0;
    printf("The %2dst Fibonacci number is %3d\n", b, c+1);
    while (c <= 100) {
        printf("The %2dst Fibonacci number is %3d\n", b+1, c);
        b = a;
        a = c;
        c = a + b;
    }
    return 0;
}


