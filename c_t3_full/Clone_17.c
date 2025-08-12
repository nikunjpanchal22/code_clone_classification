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
  int fI=2; 
  int fiB=0; 
  int fr1=1; 
  int fr2=0;
  
  printf("The %2dst Fibonacci number is %3d\n", fI-1, fiB+1); 
  fiB=fr1+fr2;  
  do
  { 
    printf("The %2dst Fibonacci number is %3d\n", fI, fiB); 
    fr2=fr1; 
    fr1=fiB; 
    fI++; 
  }while((fiB=fr1+fr2)<=100); 
return 0; 
}


