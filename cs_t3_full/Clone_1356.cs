public static void MoveFilesTo (this Folder folder, string folderUrl) {
    var ctx = (ClientContext) folder.Context;
    if (! ctx.Web.IsPropertyAvailable ("ServerRelativeUrl")) {
        ctx.Load (ctx.Web, w => w.ServerRelativeUrl);
    }
    ctx.Load (folder, f => f.Files, f => f.ServerRelativeUrl, f => f.Folders);
    ctx.ExecuteQuery ();
    EnsureFolder (ctx.Web.RootFolder, folderUrl.Replace (ctx.Web.ServerRelativeUrl, string.Empty));
    foreach (var file in folder.Files) {
        var targetFileUrl = file.ServerRelativeUrl.Replace (folder.ServerRelativeUrl, folderUrl);
        file.MoveTo (targetFileUrl, MoveOperations.Overwrite);
    }
    ctx.ExecuteQuery ();
    foreach (var subFolder in folder.Folders) {
        var targetFolderUrl = subFolder.ServerRelativeUrl.Replace (folder.ServerRelativeUrl, folderUrl);
        subFolder.MoveFilesTo (targetFolderUrl);
    }
}


 public static void MoveFilesTo (this Folder folder, string folderUrl) {
    var ctx = (ClientContext) folder.Context;
    ctx.Load (folder, f => f.Files, f => f.ServerRelativeUrl, f => f.Folders);
    if (! ctx.Web.IsPropertyAvailable ("ServerRelativeUrl")) {
        ctx.Load (ctx.Web, w => w.ServerRelativeUrl);
    }
    ctx.ExecuteQuery ();
    Folder sf = ctx.Web.RootFolder;
    string fpath = folderUrl.Replace(ctx.Web.ServerRelativeUrl, "");
    Folder f = CreateFolder(sf,fpath);
   
    foreach (var file in folder.Files) {
        var targetFileUrl = file.ServerRelativeUrl.Replace (folder.ServerRelativeUrl, folderUrl);
        File oldFile = file.ListItemAllFields;
        string existingName = oldFile.Name;
        oldFile.CopyTo(fpath + "/" + existingName, true); 
        File newFile = f.Files.GetByUrl(existingName);
        oldFile.DeleteObject();
        ctx.ExecuteQuery();
    }
    foreach (var subFolder in folder.Folders) {
        var targetFolderUrl = subFolder.ServerRelativeUrl.Replace (folder.ServerRelativeUrl, folderUrl);
        subFolder.MoveFilesTo (targetFolderUrl);
    }
}


