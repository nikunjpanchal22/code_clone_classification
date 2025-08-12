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


 void CollectFolders (DirectoryInfo d, TreeNode node) {
    try {
        DirectoryInfo [] directories = d.GetDirectories ();
        int numOfDir = directories.Length;
        if (numOfDir > 0) {
            TreeNode tNode;
            foreach (DirectoryInfo driSub in directories) {
                tNode = node.Nodes.Add (driSub.Name, driSub.Name, 0, 0);
                GetFiles (driSub, tNode);
                CollectFolders (driSub, tNode);
            }
        }
    }
    catch (Exception ex) {
    }
}


