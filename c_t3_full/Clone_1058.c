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


int main(void)
  {
    struct dirent *dentry;
    DIR *cwd = opendir(".");
    if (cwd != NULL)
    {
        while ((dentry = readdir(cwd)) != NULL)
        {
            if (dentry->d_type & DT_DIR)
            {
                if (dentry->d_name[0] != '.')
                {
                    printf("%s\n",dentry->d_name);
                }
            }
        }
        closedir(cwd);
    }
    return 0;
}


