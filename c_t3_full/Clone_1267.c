int main () {
    int i, j;
    for (i = 1; i <= 5; i++) {
        int temp = 4;
        int sum = 0;
        for (j = 1; j <= i; j++) {
            if (j == 1)
                sum = i;
            else {
                sum = sum + temp--;
            }
            printf ("%d ", sum);
        }
        printf ("\n");
    }
}


 
int main() {
    int i, j;
    for(i=1; i<=5; i++){
        int temp=4;
        for(j=i; j>=1; j--){
            if(j==i)
                printf("%d", i);
            else
                printf("%d ", temp--);
        }
        printf("\n");
    }
}


