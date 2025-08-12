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


 int main(){
    int q = 2, Fib = 0, a_partial = 1, b_partial = 0;
    printf("The %2dst Fibonacci number is %3d\n", q - 1, Fib);
    Fib = a_partial + b_partial;
    do{
        printf("The %2dst Fibonacci number is %3d\n", q, Fib);
        b_partial = a_partial;
        a_partial = Fib;
        q++;
    }while ((Fib = a_partial + b_partial) <= 100);
    return 0;
}
