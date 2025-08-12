int main (void) {
    int i = 1;
    void *the_label_pointer;
the_label :
    the_label_pointer = &&the_label;
    if (i--)
        jumpto (the_label_pointer);
    return 0;
}




int main (void) {
    int i = 1;
do {
    if (i==0)
        goto Label;
    i--;
} while (i>0);
Label: 
    return 0;
}


