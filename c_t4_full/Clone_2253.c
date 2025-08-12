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

int main() {
    struct dirent *dp;
    DIR *dir = opendir(".");
    while ((dp = readdir(dir)) != NULL)
        if (dp->d_type & DT_DIR && dp->d_name[0] != '.')
            puts(dp->d_name);
    closedir(dir);
}


