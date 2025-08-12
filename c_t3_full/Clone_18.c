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
  int i=2;  
  int result=0; 
  int fp1=1; 
  int fp2=0;

  printf("The %2dst Fibonacci number is %3d\n", i-1, result+1);
  result=fp1+fp2; 
 
  do{  
    printf("The %2dst Fibonacci number is %3d\n", i, result);
    fp2=fp1;  
    fp1=result; 
    i++; 
  }while((result=fp1+fp2)<=100); 

  return 0;
}


