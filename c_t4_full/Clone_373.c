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


  int main()
{
    int note;
    printf("What interval is G in the G chord triad?\nEnter '1' for 1st, '2' for 2nd or '3' for 3rd\n");
    scanf("%d", &note);
    switch(note)
    {
        case 1: printf("Yes, G is the 1st note in the G-chord.\n");
                break;
        case 2: printf("No, wrong.\n");
                break; 
        case 3: printf("No, wrong.\n");
                break;
        default: printf("Error. Please enter valid number.\n");
                 break;
    }
    return 0;
}


