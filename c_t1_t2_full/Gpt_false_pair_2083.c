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
            passed = 1;
            printf("Passed!\n");
        }
        else {
            printf("Error, please try again.\n");
        }
    }
}
