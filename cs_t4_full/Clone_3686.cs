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
        foreach (var directory in d.GetDirectories()) {
            TreeNode subNode = new TreeNode(directory.Name);
            node.Nodes.Add(subNode);
            GetFiles (directory, subNode);
            GetFolders (directory, subNode);
        }
    } catch {
    }
}


