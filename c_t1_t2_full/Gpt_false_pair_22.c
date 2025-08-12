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
    int i = 2, fib = 0, part_one = 1, part_two = 0;
    printf("The %2dst Fibonacci number is %3d\n", i - 1, fib);
    fib = part_one + part_two;
    do{
        printf("The %2dst Fibonacci number is %3d\n", i, fib);
        part_two = part_one;
        part_one = fib;
        i++;
    }while((fib = part_one + part_two) <= 100);
    return 0;
}
