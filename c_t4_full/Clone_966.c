int main () {
    int dec_num;
    printf ("type in a 3 digit number to convert to binary\n");
    if (scanf ("%d", &dec_num) != 1) {
        printf ("invalid input\n");
        return 1;
    }
    if (dec_num < 0 || dec_num > 999) {
        printf ("invalid value: must have at most 3 digits\n");
        return 1;
    }
    for (;;) {
        if (dec_num % 2 != 0) {
            printf ("1");
        }
        else {
            printf ("0");
        }
        dec_num = dec_num / 2;
        if (dec_num == 0)
            break;
    }
    printf ("\n");
    return 0;
}





int main() {
    int x;
    printf("Enter a three-digit number:\n");
    if(scanf("%d", &x) != 1 || x < 0 || x > 999) {
        printf("Invalid input\n");
        exit(EXIT_FAILURE);
    }
    char binary[10] = {0};
    int y = 0;
    while(x > 0) {
        binary[y++] = (x % 2) + '0';
        x /= 2;
    }
    for(int i = y - 1; i >= 0; i--)
        printf("%c", binary[i]);
    printf("\n");
    return 0;
}


