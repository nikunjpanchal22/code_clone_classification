int main () {
    char z [10];
    int a;
    printf ("enter the no.");
    scanf ("%d", & a);
    printf ("the entered no. is:%d\n", a);
    int i;
    for (i = 0; i < a; i++) {
        printf ("enter the letters:");
        scanf ("%c", & z [i]);
    }
    printf ("the entered letters are:");
    for (i = 0; i < a; i++) {
        printf ("%c\n", z [i]);
    }
    return 0;
}





#include<stdio.h>
int main(){
    int no,i;
    char arr[10];
    printf("Enter the no:");
    scanf("%d",&no);
    flush(stdin); 
    for(i=0;i<no;i++){
        printf("Enter letters:");
        scanf("%c",&arr[i]);
    }
    printf("The letters entered are: "); 
    for(i=0;i<no;i++){
        printf("%c ",arr[i]);
    }
}


