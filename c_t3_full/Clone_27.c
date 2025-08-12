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
    int sum;
    int fibonacci = 0, fParcialone = 1, fParcialtwo = 0;
    int n;
    printf ("The %2dst Fibonacci number is %3d\n", 0, fibonacci);
    for (n = 2; fibonacci <= 100; n++) {
        sum = fParcialone + fParcialtwo;
        printf ("The %2dst Fibonacci number is %3d\n", n, sum);
        fParcialtwo = fParcialone;
        fParcialone = fibonacci;
        fibonacci = sum;
    }
    return 0;
}


