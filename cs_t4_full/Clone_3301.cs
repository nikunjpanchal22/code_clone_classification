public void SelectFiles () {
    int i;
    SelectedFileText.Text = "";
    dlg = new Microsoft.Win32.OpenFileDialog ();
    dlg.Multiselect = true;
    Nullable < bool > result = dlg.ShowDialog ();
    foreach (String filename in dlg.FileNames) {
        SelectedFileText.Text += filename + "\n";
        uploadFileList.Add (filename);
    }
}


public void SelectFiles()
{
    SelectedFileText.Clear();
    Microsoft.Win32.OpenFileDialog dialog = new Microsoft.Win32.OpenFileDialog
    {
        Multiselect = true
    };

    if (dialog.ShowDialog() == true)
    {
        foreach (var file in dialog.FileNames)
        {
            SelectedFileText.AppendText(file + Environment.NewLine);
            uploadFileList.Add(file);
        }
    }
}


