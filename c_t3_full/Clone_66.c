int main () {
    int arr [] = {601, 602, 603, 604, 605, 605, 606, 607};
    int n = sizeof (arr) / sizeof (arr[0]);
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            int res = arr[i] ^ arr[j];
            if (res == 0) {
            printf("Repeated Element in array = ",arr [i] );
            }
        }
    }
    return 0;
}


 
int main() 
{ 
    int arr [] = {601, 602, 603, 604, 605, 605, 606, 607}; 
    int n = sizeof (arr) / sizeof (arr[0]); 
    for(int i=0;i < n-1;i++) 
    { 
        for(int j=i+1;j < n;j++) 
        { 
            if(arr[i] == arr[j]) 
            { 
                printf("Repeated Element in array = ",arr [i] ); 
            } 
        } 
    } 
    return 0;
}


