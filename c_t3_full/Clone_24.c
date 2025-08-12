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
    int num;
    int fibonacci = 0, fParcialone = 1, fParcialtwo = 0;
    printf ("The %2dst Fibonacci number is %3d\n", 0, fibonacci); 
    num = 2;
    do {
        fibonacci = fParcialone + fParcialtwo;
        printf ("The %2dst Fibonacci number is %3d\n", num, fibonacci);
        fParcialtwo = fParcialone;
        fParcialone = fibonacci;
        num++;
    }
    while(fibonacci <= 100);
    return 0;
}


