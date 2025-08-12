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


 int main()
{
  int a = 2; 
  int b = 0;
  int f1 = 1;
  int f2 = 0;

  printf("The %2dst Fibonacci number is %3d\n", a-1, b+1);
  b = f1 + f2;

  do
  {
    printf("The %2dst Fibonacci number is %3d\n", a, b);
    f2 = f1;
    f1 = b;
    a++;
    }while((b = f1 + f2) <= 100);
    return 0;
}


