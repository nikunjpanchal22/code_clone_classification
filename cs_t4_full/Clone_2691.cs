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




public void SelectFiles() 
{
    OpenFileDialog pfdlg = new OpenFileDialog();
    pfdlg.Multiselect = true;
    var result = pfdlg.ShowDialog();
    if (result.GetValueOrDefault()) 
    {
        uploadFileList.Clear();
        uploadFileList.AddRange(pfdlg.FileNames);
        SelectedFileText.Text = string.Join("\n", uploadFileList);
    }
}


