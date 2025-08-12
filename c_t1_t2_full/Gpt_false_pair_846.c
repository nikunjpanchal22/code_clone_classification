int main () {
    int note = 0;
    printf ("What interval is G in the G chord triad \nEnter 1 2 or 3\n");
    scanf ("%i", & note);
    if (note == 1) {
        printf ("Yes G is %ist note in the G-chord\n", G);
    }
    else {
        printf ("no, wrong");
    }
    return 0;
}


 int main () {
    int note;
    printf("What interval is G in the G chord triad?\nEnter 1 for first, 2 for second or 3 for third\n");
    scanf ("%d", &note);
    if (note == 1) {
        printf ("Yes G is the %ist note in the G-chord\n", note);
    } else {
      printf ("No, wrong.");
    }
    return 0;
}
