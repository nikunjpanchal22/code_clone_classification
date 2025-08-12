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
            printf("Input accepted.\n");
            passed = 1;
            break;
        }
        else {
            printf("Input not accepted.\n");
        }
    }
}
