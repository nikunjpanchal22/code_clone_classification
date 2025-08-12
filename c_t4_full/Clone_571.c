int main () {
    char a [] = {'2', '4', '6', '7', '7', '4', '4'};
    int i;
    for (i = 0; i < sizeof (a) / sizeof (char); i++) {
        my_set[a[i] - '0'].num++;
    }
    printf ("%-10s%-10s\n", "Value:", "Count:");
    for (i = 0; i < sizeof (my_set) / sizeof (TSet); i++) {
        if (my_set[i].num != 0) {
            printf ("%-10c%-10d\n", my_set [i].c, my_set [i].num);
        }
    }
}


 int main () {
    char a [] = {'2', '4', '6', '7', '7', '4', '4'};
    int i;
    char my_set[10];
    int j;

    for (i = 0; i < sizeof (a) / sizeof (char); i++) {
        for (j = 0; j < 10; j++) {
            if (my_set[j] == a[i]) {
                my_set[j + 10]++;
                break;
            } else if (my_set[j] == 0) {
                my_set[j] = a[i];
                my_set[j + 10]++;
                break;
            }
        }
    }
    printf ("%-10s%-10s\n", "Value:", "Count:");
    int k;
    for (i = 0; i < 10; i++) {
        k = 0;
        if (my_set[i] != 0) {
            for (j = 0; j < 10; j++) {
                if (my_set[j] == my_set[i]) {
                    k++;
                }
            }
            if (k != 0) {
                printf ("%-10c%-10d\n", my_set[i], k);
            }
        }
    }
}


