int main (void) {
    const char *pins [] = {"d1", "d2", "d3", "d4", "d5", "o1", "o2", "o3", "o4"};
    const int pinsNumbers [] = {1, 2, 19, 4, 14, 6, 12, 15, 17};
    const char *key = "d3";
    const char **p = bsearch (&key, pins, sizeof (pins) / sizeof (*pins), sizeof (const char *), cmp);
    if (p)
        printf ("%d\n", pinsNumbers[p - pins]);
    return 0;
}


 //implentation 6
int main (void)
{
    const char *pins [] = {"d1", "d2", "d3", "d4", "d5", "o1", "o2", "o3", "o4"};
    const int pinsNumbers [] = {1, 2, 19, 4, 14, 6, 12, 15, 17};
    const char *key = "d3";

    int n = sizeof(pins) / sizeof(*pins);
    int low = 0;
    int high = n - 1;
    int mid;

    while (low <= high) 
    {
        mid = (high + low) / 2; 
        int res = strcmp(pins[mid], key);
        if (res == 0) 
        {
            printf("%d\n", pinsNumbers[mid]);
            break;
        } 
        else if (res > 0) 
            high = mid - 1; 
        else
            low = mid + 1; 
    } 

    return 0;
}


