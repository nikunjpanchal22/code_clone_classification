int main (void) {
    int inputArr [999];
    int c = 0;
    int length = 0;
    int gotdigit = 0;
    while ((c = getchar ()) != '\n' && c != EOF) {
        if (isdigit (c) && !gotdigit) {
            inputArr[length] = c - '0';
            length++;
            if (length >= 999) {
                break;
            }
            gotdigit = 1;
        }
        else {
            if (c == ' ') {
                gotdigit = 0;
            }
            else {
                printf ("Wrong Input Format!\n");
            }
        }
    }
    return 0;
}


int main (void) {
    int inputArr [999];
    int c = 0;
    int length = 0;
    int gotnumber = 0;
    while ((c = getchar ()) != '\n' && c != EOF) {
        if (isdigit (c) && !gotnumber) {
            inputArr[length] = c - '0';
            length++;
            if (length >= 999) {
                break;
            }
            gotnumber = 1;
        }
        else {
            if (c == ' ') {
                gotnumber = 0;
            }
            else {
                printf ("Wrong Input Format!\n");
            }
        }
    }
    return 0;
}
