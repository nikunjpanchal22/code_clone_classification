int main () {
    int A [] = {5, -5, 14, 5, 2};
    int B [] = {3, 6, 11};
    int C [] = {4, 1, -3, 4};
    int D [] = {6, 2, 7, 1, 8, 2};
    int E [] = {2, 15};
    int F [] = {3, 4, -2};
    int *All [] = {A, B, C, D, E, F, NULL};
    int index = 1;
    int rem = 6;
    while (rem > 0) {
        for (int i = 0; i < 6; i++) {
            int *arr = All[i];
            if (index < arr[0])
                printf ("%-4d", arr[index]);
            else {
                rem--;
                printf ("    ");
            }
        }
        index++;
        printf ("\n");
    }
    return 0;
}


int main () {
    int X [] = {5, -5, 14, 5, 2};
    int Y [] = {3, 6, 11};
    int Z [] = {4, 1, -3, 4};
    int P [] = {6, 2, 7, 1, 8, 2};
    int Q [] = {2, 15};
    int R [] = {3, 4, -2};
    int *All [] = {X, Y, Z, P, Q, R, NULL};
    int index = 1;
    int rem = 6;
    while (rem > 0) {
        for (int i = 0; i < 6; i++) {
            int *arr = All[i];
            if (index < arr[0])
                printf ("%-4d", arr[index]);
            else {
                rem--;
                printf ("    ");
            }
        }
        index++;
        printf ("\n");
    }
    return 0;
}
