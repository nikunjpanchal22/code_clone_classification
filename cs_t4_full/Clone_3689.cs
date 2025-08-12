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
        foreach (var subDir in d.GetDirectories()) {
            TreeNode subNode = node.Nodes.Add(subDir.Name);
            GetFiles (subDir, subNode);
            GetFolders (subDir, subNode);
        }
    } catch {
    }
}


