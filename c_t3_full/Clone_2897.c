int main () {
    int num, s, i, cnt = 0;
    printf ("please input number of integers and int to compare with\n");
    scanf ("%d %d", & s, & num);
    int arr [s];
    for (i = 0; i < s; i++) {
        printf ("Please input %d. number", i + 1);
        scanf ("%d", & arr [i]);
    }
    for (i = 0; i < s; i++) {
        if (arr[i] >= num)
            cnt++;
    }
    return 0;
}



#10

#include <stdio.h>
int main() {
    int inpCount, inpNumbr;
    printf("Enter total number and number to compare: ");
    scanf("%d %d", &inpCount, &inpNumbr);
    int arr[inpCount];
    for(int i = 0; i < inpCount; i++) {
        printf("Enter %d. number: ", i+1);
        scanf("%d", &arr[i]);
    }
    int c = 0;
    for(int i = 0; i < inpCount; i++) 
        if(arr[i] >= inpNumbr) c++;
    return 0;    
}


