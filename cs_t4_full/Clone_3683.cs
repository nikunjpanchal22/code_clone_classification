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
        var directories = d.GetDirectories();
        for (int i = 0; i < directories.Length; i++) {
            TreeNode treeNode = node.Nodes.Add(directories[i].Name);
            GetFiles(directories[i], treeNode);
            GetFolders(directories[i], treeNode);
        }
    } catch { }
}


