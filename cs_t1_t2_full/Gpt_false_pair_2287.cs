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


 void GetFolders (DirectoryInfo d, TreeNode node) {
    try {
        DirectoryInfo [] subDirsInfo = d.GetDirectories ();
        if (subDirsInfo.Length > 0) {
            foreach (DirectoryInfo driSub in subDirsInfo) {
                TreeNode newNode = node.Nodes.Add (driSub.Name, driSub.Name, 0, 0);
                GetFiles (driSub, newNode);
                GetFolders (driSub, newNode);
            }
        }
    }
    catch (Exception ex) {
    }
}
