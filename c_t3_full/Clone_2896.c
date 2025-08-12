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



#7

#include <stdio.h>
int main() {
    int cnt, numbr;
    printf("Enter num of elements and the number to compare: ");
    scanf("%d %d", &cnt, &numbr);
    int arr[cnt];
    for(int i = 0; i < cnt; i++) {
        printf("Please input %d. number: ", i+1);
        scanf("%d", &arr[i]);
    }
    int count = 0;
    for(int i = 0; i < cnt; i++) 
        if(arr[i] >= numbr) count++;
    return 0;    
}


