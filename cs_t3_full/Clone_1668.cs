void GetFolders (DirectoryInfo d, TreeNode node) {
    try {
        DirectoryInfo [] dInfo = d.GetDirectories ();
        if (dInfo.Length > 0) {
            TreeNode treeNode = new TreeNode ();
            foreach (DirectoryInfo driSub in dInfo) {
                treeNode = node.Nodes.Add (driSub.Name, driSub.Name, 0, 0);
                GetFiles (driSub, treeNode);
                GetFolders (driSub, treeNode);
            }
        }
    }
    catch (Exception ex) {
    }
}


 void RetrieveFolders (DirectoryInfo d, TreeNode node) {
    try {
        DirectoryInfo [] dirs = d.GetDirectories ();
        int numberOfDirs = dirs.Length;
        if (numberOfDirs > 0) {
            TreeNode tNode;
            foreach (DirectoryInfo driSub in dirs) {
                tNode = node.Nodes.Add (driSub.Name, driSub.Name, 0, 0);
                GetFiles (driSub, tNode);
                RetrieveFolders (driSub, tNode);
            }
        }
    }
    catch (Exception ex) {
    }
}


