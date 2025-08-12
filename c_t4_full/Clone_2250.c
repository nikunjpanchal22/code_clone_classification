int main (void) {
    DIR *dirp;
    struct dirent *dp;
    dirp = opendir (".");
    while ((dp = readdir (dirp)) != NULL) {
        if (dp->d_type & DT_DIR) {
            if (dp->d_name[0] != '.')
                printf ("%s\n", dp->d_name);
        }
    }
    closedir (dirp);
    return 0;
}





#include <dirent.h>
#include <stdio.h>

void main (void) {
    struct dirent *de;
    DIR *dr = opendir(".");
    while ((de = readdir(dr)))
        if (de->d_type == DT_DIR && de->d_name[0] != '.')
            printf("%s\n", de->d_name);
    closedir(dr);
}


