public void SelectFiles () {
    dlg = new Microsoft.Win32.OpenFileDialog ();
    dlg.Multiselect = true;
    Nullable < bool > result = dlg.ShowDialog ();
    if (result == true) {
        uploadFileList.Clear ();
        uploadFileList.AddRange (dlg.FileNames);
        SelectedFileText.Text = String.Join (Environment.NewLine, uploadFileList);
    }
}



public void SelectFiles() {
    OpenFileDialog fileDialog = new OpenFileDialog();
    fileDialog.Multiselect = true;
    bool? userClickedOK = fileDialog.ShowDialog();
    if(userClickedOK == true) {
        uploadFileList.Clear();
        uploadFileList.AddRange(fileDialog.FileNames.ToList());
        SelectedFileText.Text = string.Join("\n", uploadFileList);
    }
}


