private void OnChanged (object source, FileSystemEventArgs e) {
    string fullFilePath = e.FullPath.ToString ();
    string fullURL = buildTheUrlFromStudyXML (fullFilePath);
    System.Diagnostics.Process.Start ("iexplore", fullURL);
    Timer timer = new Timer ();
    ((FileSystemWatcher) source).Changed -= new FileSystemEventHandler (OnChanged);
    timer.Interval = 1000;
    timer.Elapsed += new ElapsedEventHandler (t_Elapsed);
    timer.Start ();
}


private void OnChanged (object source, FileSystemEventArgs e) {
    string fullFilePath = e.FullPath;
    string fullURL = ConstructURLFromStudyXML (fullFilePath);
    StartProcess ("iexplore", fullURL);
    Timer timer = new Timer ();
    ((FileSystemWatcher) source).Changed -= new FileSystemEventHandler (OnChanged);
    timer.Interval = 1000;
    timer.Elapsed += new ElapsedEventHandler (t_Elapsed);
    timer.Begin ();
}
