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


public void SelectFiles () {
    SelectedFileText.Text = "";
    using Microsoft.Win32.OpenFileDialog dlg = new Microsoft.Win32.OpenFileDialog(); 
    dlg.Multiselect = true;
    Nullable < bool > result = dlg.ShowDialog ();
    if (result == true) {
        foreach (String filename in dlg.FileNames) {
            SelectedFileText.Text += filename + "\n";
            uploadFileList.Add (filename);
        }
    }
}
