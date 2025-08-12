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



#9

#include <stdio.h>
int main() {
    int inpNum, cmpNum;
    printf("Input number and number to compare: ");
    scanf("%d %d", &inpNum, &cmpNum);
    int arr[inpNum];
    for(int i = 0; i < inpNum; i++) {
        printf("Please enter %d. number: ", i+1);
        scanf("%d", &arr[i]);
    }
    int cnt = 0;
    for(int i = 0; i < inpNum; i++) 
        if(arr[i] >= cmpNum) cnt++;
    return 0;    
}


