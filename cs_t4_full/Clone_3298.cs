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


// Implementation 4
public async void SelectFiles()
{
    SelectedFileText.Text = "";
    var dialog = new Microsoft.Win32.OpenFileDialog() { Multiselect = true };
    var result = dialog.ShowDialog();

    if (result.HasValue && result.Value)
    {
        foreach (var file in dialog.FileNames)
        {
            SelectedFileText.Text += file + "\n";
            uploadFileList.Add(file);
        }
    }
}


