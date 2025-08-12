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




typedef struct news{
    char *name;
    int index;
} news;

news* insert(news *note, char *name, int index){
    news *new_note = (news *)malloc(sizeof(news));
    new_note->name = strdup(name);
    new_note->index = index;
    return new_note;
}


