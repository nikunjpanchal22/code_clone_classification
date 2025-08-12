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
    int note = 0;
    printf ("What interval is E in the E7 chord \nEnter 1 2 3 or 4\n");
    scanf ("%i", & note);
    if (note == 1) {
        printf ("Yes E is %ist note in the E7-chord\n", E);
    }
    else {
        printf ("no, wrong");
    }
    return 0;
}
