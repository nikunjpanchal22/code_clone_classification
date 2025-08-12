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




#6

#include <stdio.h>
int main() {
    int range, ref_num;
    printf("Enter range and reference number: ");
    scanf("%d %d", &range, &ref_num);
    int arr[range];
    for(int i = 0; i < range; i++) {
        printf("Enter %d. number: ", i+1);
        scanf("%d", &arr[i]);
    }
    int total = 0;
    for(int i = 0; i < range; i++) 
        if(arr[i] >= ref_num) total++;
    return 0;  
}


