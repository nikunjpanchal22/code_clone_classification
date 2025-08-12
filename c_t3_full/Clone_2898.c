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



#3

#include <stdio.h>
int main() {
    int sz, nm;
    printf("Input count and num to compare: ");
    scanf("%d %d", &sz, &nm);
    int arr[sz];
    for(int i = 0; i < sz; i++) {
        printf("Enter %d. number: ", i+1);
        scanf("%d", &arr[i]);
    }
    int cntr = 0;
    for(int i = 0; i < sz; i++) 
        if(arr[i] >= nm) cntr++;
    return 0;
}


