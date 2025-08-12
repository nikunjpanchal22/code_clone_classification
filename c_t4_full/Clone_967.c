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
    int num;
    printf("Enter a three-digit number:\n");
    if(scanf("%d", &num) != 1 || num < 0 || num > 999) {
        printf("Invalid entry\n");
        return 1;
    }
    int i = 0;
    int binary[10] = {};

    while(num) {
        binary[i++] = num % 2;
        num /= 2;
    }
    
    for(int j = i - 1; j >= 0; j--)
        printf("%d", binary[j]);
    printf("\n");
    return 0;
}


