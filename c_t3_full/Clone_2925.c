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
    Label: 
        if (--i)
            goto Label;
    return 0;
}


