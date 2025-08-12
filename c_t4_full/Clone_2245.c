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





#include <unistd.h>
#include <fcntl.h>
#include <stdio.h>
#include <dirent.h>

int main() {
    DIR *dp;
    struct dirent *dirp;
    if((dp = opendir(".")) == NULL)
        return 1;
    while((dirp = readdir(dp)) != NULL)
        if(dirp->d_name[0] != '.' && dirp->d_type == DT_DIR)
            printf("%s\n", dirp->d_name);

    (void)closedir(dp);
    return 0;
}


