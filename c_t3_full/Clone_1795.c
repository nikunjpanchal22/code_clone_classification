int main (void) {
    struct foo_t buf [12];
    struct foo_t positive [12];
    struct foo_t negative [12];
    size_t len;
    foo (buf, sizeof (buf) / sizeof (buf [0]), & len);
    size_t c, positive_len, negative_len;
    for (c = positive_len = negative_len = 0; c < len; c++) {
        if (buf[c].X < 8)
            positive[positive_len++] = buf[c];
        else
            negative[negative_len++] = buf[c];
    }
    puts ("POSITIVE:");
    for (size_t i = 0; i < positive_len; i++)
        printf ("%d\n", positive[i].X);
    puts ("NEGATIVE:");
    for (size_t i = 0; i < negative_len; i++)
        printf ("%d\n", negative[i].X);
}


 
int main (void) {
    struct foo_t buf [12];
    struct foo_t positive [12];
    struct foo_t negative [12];
    size_t len;
    foo (buf, sizeof (buf) / sizeof (buf [0]), & len);
    size_t c, positive_len, negative_len;
    negative_len = len;
    positive_len = len;

    for (c = len; c > 0; c--) {
        if (buf[c].X < 8) {
            positive[positive_len] = buf[c];
            positive_len--;
        }
        else {
            negative[negative_len] = buf[c];
            negative_len--;
        }
    }
    puts ("POSITIVE:");
    for (size_t i = positive_len; i < len; i++)
        printf ("%d\n", positive[i].X);
    puts ("NEGATIVE:");
    for (size_t i = negative_len; i < len; i++)
        printf ("%d\n", negative[i].X);
}


