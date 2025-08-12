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



#2

#include <stdio.h>
int main() {
    int n, val;
    printf("Input n and val: ");
    scanf("%d %d", &n, &val);
    int a[n];
    for(int i = 0; i < n; i++) {
        printf("Enter %d. number: ", i+1);
        scanf("%d", &a[i]);
    }
    int count = 0;
    for(int i = 0; i < n; i++) 
        if(a[i] >= val) count++;
}


