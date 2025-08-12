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
    int index = 2, fib_num = 0, one_part = 1, two_part = 0;
    printf("The %2dst Fibonacci number is %3d\n", index - 1, fib_num);
    fib_num = one_part + two_part;
    do{
        printf("The %2dst Fibonacci number is %3d\n", index, fib_num);
        two_part = one_part;
        one_part = fib_num;
        index++;
    }while((fib_num = one_part + two_part) <= 100);
    return 0;
}
