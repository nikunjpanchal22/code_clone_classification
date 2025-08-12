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
    OpenFileDialog dlg = new OpenFileDialog();
    dlg.Multiselect = true;
    if (dlg.ShowDialog().GetValueOrDefault()) 
    {
        uploadFileList.Clear();
        uploadFileList.AddRange(dlg.FileNames);
        SelectedFileText.Text = string.Join(Environment.NewLine, uploadFileList);
    }
}


