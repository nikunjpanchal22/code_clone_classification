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


// Implementation 8
public void SelectFiles()
{
    SelectedFileText.Text = "";
    var dialog = new Microsoft.Win32.OpenFileDialog();
    dialog.Multiselect = true;

    if (dialog.ShowDialog() == true)
    {
        SelectedFileText.Text = String.Join("\n", dialog.FileNames);
        uploadFileList.AddRange(dialog.FileNames);
    }
}


