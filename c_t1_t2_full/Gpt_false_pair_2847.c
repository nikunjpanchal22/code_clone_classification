int main () {
    int i, m1, m2, n, num;
    puts ("\n");
    scanf ("%d", & n);
    for (i = 0; i < n; i++) {
        scanf ("%d", & num);
        if (i == 0) {
            m1 = num;
            m2 = num;
        }
        else if (num == -1) {
            break;
        }
        else if (num > m1) {
            m2 = m1;
            m1 = num;
        }
        else if (num > m2) {
            m2 = num;
        }
    }
    printf ("%d\n", m2);
    return 0;
}


int main () {
    int i, m1, m2, n, num;
    puts ("\n");
    scanf ("%d", & n);
    for (i = 0; i < n; i++) {
        scanf ("%d", & num);
        if (i == 0) {
            m1 = num;
            m2 = num;
        }
        else if (num == -1) {
            break;
        }
        else {
            if (num > m1) {
                m2 = m1;
                m1 = num;
            }
            else if (num > m2) {
                m2 = num;
            }
        }
    }
    printf ("%d\n", m2);
    return 0;
}
