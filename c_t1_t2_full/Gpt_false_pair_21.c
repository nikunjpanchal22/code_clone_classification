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
    int index_two = 2, fib_num_two = 0, partial_one = 1, partial_two = 0;
    printf("The %2dst Fibonacci number is %3d\n", index_two - 1, fib_num_two);
    fib_num_two = partial_one + partial_two;
    do{
        printf("The %2dst Fibonacci number is %3d\n", index_two, fib_num_two);
        partial_two = partial_one;
        partial_one = fib_num_two;
        index_two++;
    }while((fib_num_two = partial_one + partial_two) <= 100);
    return 0;
}
