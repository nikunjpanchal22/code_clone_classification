int main (void) {
    int passed = 0;
    while (!passed) {
        if (strcmp (inp, "pass") == 0) {
            passed = 1;
        }
        else {
            msghere ("error");
        }
    }
}


 
int main (void) {
    int passed = 0;
    while (!passed) {
        if (strcmp (inp, "pass") == 0) {
            printf("You've passed!\n");
            passed = 1;
            break;
        }
        else {
            printf("Error, please try again.\n");
        }
     }
}
