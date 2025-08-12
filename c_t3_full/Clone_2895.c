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



#8

#include <stdio.h>
int main() {
    int elmnts, refnumbr;
    printf("Input number of elements and the reference number: ");
    scanf("%d %d", &elmnts, &refnumbr);
    int arr[elmnts];
    for(int i = 0; i < elmnts; i++) {
        printf("Input %d. number: ", i+1);
        scanf("%d", &arr[i]);
    }
    int c = 0;
    for(int i = 0; i < elmnts; i++) 
        if(arr[i] >= refnumbr) c++;
    return 0;    
}


