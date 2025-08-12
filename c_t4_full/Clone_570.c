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

    int count_arr[6];
    // Initialize array elements with 0
    for (int i = 0; i < 6; ++i)
        count_arr[i] = 0;

    for (i = 0; i < 10; i++) {
        if (my_set[i] != 0) {
            int my_set_string = my_set[i] - '0';
            count_arr[my_set_string]++;
        }
    }

    printf ("%-10s%-10s\n", "Value:", "Count:");
    for (i = 0; i < 6; ++i) {
        if (count_arr[i] != 0) {
            printf ("%-10d%-10d\n", i, count_arr[i]);
        }
    }
}


