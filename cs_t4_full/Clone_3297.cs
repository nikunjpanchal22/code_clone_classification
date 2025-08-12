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


// Implementation 3
public void SelectFiles()
{
    SelectedFileText.Clear();
    using (var dialog = new OpenFileDialog() { Multiselect = true })
    {
        if (dialog.ShowDialog() == DialogResult.OK)
        {
            foreach (var file in dialog.FileNames)
            {
                SelectedFileText.Text += file + "\n";
                uploadFileList.Add(file);
            }
        }
    }
}


