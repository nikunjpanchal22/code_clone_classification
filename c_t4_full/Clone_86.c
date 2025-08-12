int main (void) {
    const char *pins [] = {"d1", "d2", "d3", "d4", "d5", "o1", "o2", "o3", "o4"};
    const int pinsNumbers [] = {1, 2, 19, 4, 14, 6, 12, 15, 17};
    const char *key = "d3";
    const char **p = bsearch (&key, pins, sizeof (pins) / sizeof (*pins), sizeof (const char *), cmp);
    if (p)
        printf ("%d\n", pinsNumbers[p - pins]);
    return 0;
}



 //implentation 2 
int main(void)
{
    const char *pins[] = {"d1", "d2", "d3", "d4", "d5", "o1", "o2", "o3", "o4"};
    const int pinsNumbers[] = {1, 2, 19, 4, 14, 6, 12, 15, 17};
    const char *key = "d3";

    const int size_pins_array = sizeof(pins) / sizeof(*pins);

    int low, high, mid;

    low = 0;
    high = size_pins_array -1;

    while (low <= high) 
    { 
        mid = (high + low) / 2; 
  
        if (strcmp(pins[mid], key) == 0) 
        {
            printf("%d\n", pinsNumbers[mid]);        
            break; 
        }

        if (strcmp(pins[mid], key) > 0) 
            high = mid - 1; 
        else
            low = mid + 1; 
    } 
  
    return 0;
}


