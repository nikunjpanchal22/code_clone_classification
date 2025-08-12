int main () {
    char str [] = "- This, a sample string.";
    char *pch;
    printf ("Splitting string \"%s\" into tokens:\n", str);
    pch = strtok (str, " ,.-");
    while (pch != NULL) {
        printf ("%s\n", pch);
        pch = strtok (NULL, " ,.-");
    }
    return 0;
}





#include <stdio.h>
#include <string.h>

int main()
{
		char seq[]="- Here's, a fancier, you.";
		char *elem;

		printf("Splitting string \"%s\" into elements:\n",seq);

		for (elem=strtok(seq," ,.-");elem!=NULL;elem=strtok(NULL," ,.-")) 
	    {
			printf("%s\n",elem);
		}
		return 0;
}


