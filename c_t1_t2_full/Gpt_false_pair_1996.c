int main () {
    news *note = NULL;
    int j, k;
    for (j = 0; j < 5; j++) {
        news *new_note = insert (note, "hello", j);
        if (new_note) {
            note = new_note;
            printf ("%s\n", note [j].name);
        }
        else
            break;
    }
    for (k = 0; k < j; k++)
        free (note[k].name);
    free (note);
    return 0;
}


 int main () {
    news *note = NULL;
    int j, k;
    for (j = 0; j < 5; j++) {
        news *new_note = save (note, "hello", j);
        if (new_note) {
            note = new_note;
            printf ("%s\n", note [j].name);
        }
        else
            break;
    }
    for (k = 0; k < j; k++)
        free_mem (note[k].name);
    free_mem (note);
    return 0;
}
