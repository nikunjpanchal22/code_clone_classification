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
    int i = 2;
    int fibonci = 0;
    int fPartial1 = 1;
    int fPartial2 = 0;

    printf("The %2dst Fibonacci number is %3d\n", i-1, fibonci+1);
    fibonci = fPartial1 + fPartial2;

    do{
        printf("The %2dst Fibonacci number is %3d\n", i, fibonci);
        fPartial2 = fPartial1;
        fPartial1 = fibonci;
        i++;
    }while((fibonci = fPartial1 + fPartial2) <= 100);
    return 0;
}


