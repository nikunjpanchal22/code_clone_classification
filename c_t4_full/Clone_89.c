int main (void) {
    const char *pins [] = {"d1", "d2", "d3", "d4", "d5", "o1", "o2", "o3", "o4"};
    const int pinsNumbers [] = {1, 2, 19, 4, 14, 6, 12, 15, 17};
    const char *key = "d3";
    const char **p = bsearch (&key, pins, sizeof (pins) / sizeof (*pins), sizeof (const char *), cmp);
    if (p)
        printf ("%d\n", pinsNumbers[p - pins]);
    return 0;
}



 //implentation 3
int main(void)
{
    const char *pins[] = {"d1", "d2", "d3", "d4", "d5", "o1", "o2", "o3", "o4"};
    const int pinsNumbers[] = {1, 2, 19, 4, 14, 6, 12, 15, 17};
    const char *key = "d3";
    
    int index = -1;

    for (int i = 0; i < 9; i++)
    {
        if (strcmp(pins[i], key) == 0)
        {
            index = i;
            break;
        }
    }

    if (index != -1)
        printf("%d\n", pins[index]);

    return 0;
}


