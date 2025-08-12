int main () {
    int var;
    scanf ("%d", & var);
    if (var > 5)
        printf ("var > 5\n");
    else
        printf ("var <= 5\n");
    return 0;
}


 


#include <stdio.h>
const char *compare_to_five(int var) {
            return var > 5 ? "var > 5" : "var <= 5";
        }

        int main() {
            int var;
            scanf("%d", &var);
            printf("%s\n", compare_to_five(var));
            return 0;
}


