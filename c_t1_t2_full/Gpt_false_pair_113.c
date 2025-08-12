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
    int arr[] = {601, 602, 603, 604, 605, 605, 606, 607};
    int n = sizeof(arr) / sizeof(arr[0]); 
    while (n--)
    {
        for (int j = 0; j < n; j++)
        {
            int res = arr[j] ^ arr[n];
            if (res == 0) 
            {
                printf("Repeated Element in array = ",arr[n] );
            }
        }
    }
    return 0;
}
