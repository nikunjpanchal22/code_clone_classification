int main () {
    int n;
    printf ("Select the sports u want to do\n");
    printf ("1.Tennis\n2.Karate\n3.Football\n");
    scanf ("%d", & n);
    Switch (n) {
    case 1 :
        printf ("You chose Tennis\n");
        break;
    case 2 :
        printf ("You chose Karate\n");
        break;
    case 3 :
        printf ("You chose Football\n");
        break;
    default :
        printf ("Please enter an appropriate number !");
    }}


 int main () {
    int n;
    printf ("Select the sport you want to do\n");
    printf ("1.Tennis\n2.Karate\n3.Football\n");
    scanf ("%d", & n);
    switch (n) {
    case 1 :
        printf ("You chose Tennis\n");
        break;
    case 2 :
        printf ("You chose Karate\n");
        break;
    case 3 :
        printf ("You chose Football\n");
        break;
    }
    if (n<1 || n>3)
        printf("Please enter an appropriate number !\n");
}
