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





#include <stdio.h>
#include <dirent.h> 

int main() {
    struct dirent *dirp;
    DIR *dir = opendir(".");
    while (dir && (dirp = readdir(dir)))
        if (dirp->d_name[0]!='.' && dirp->d_type==DT_DIR)
            puts(dirp->d_name);
    if (dir) closedir(dir);
}


