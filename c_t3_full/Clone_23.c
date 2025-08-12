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
 
 int firstNumber = 2,fiboNumber = 0;
 int partialFiboOne = 1, partialFiboTwo = 0;

 printf("The %2dst Fibonacci number is %3d\n", firstNumber - 1, fiboNumber);
 do
    {
        fiboNumber = partialFiboOne + partialFiboTwo;
        printf("The %2dst Fibonacci number is %3d\n", firstNumber , fiboNumber);
        partialFiboTwo = partialFiboOne;
        partialFiboOne = fiboNumber;
        firstNumber++;
    } 
    while ( fiboNumber <= 100);
    return 0;
}


