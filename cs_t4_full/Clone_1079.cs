private void Download_Begin () {
    web_client = new System.Net.WebClient ();
    web_client.DownloadProgressChanged += new DownloadProgressChangedEventHandler (Download_Progress);
    web_client.DownloadFileCompleted += new AsyncCompletedEventHandler (Download_Complete);
    stop_watch = new System.Diagnostics.Stopwatch ();
    stop_watch.Start ();
    try {
        if (Program.Current_Download == "Install_Client.exe") {
            web_client.DownloadFileAsync (new Uri ("http://www.website.com/Client/Install_Client.exe"), @"C:\Downloads\Install_Client.exe");
        } else {
            web_client.DownloadFileAsync (new Uri ((string.Format ("http://www.website.com/{0}", Program.Current_Download))), (string.Format (@"C:\Downloads\{0}", Program.Current_Download)));
        }
    }
    catch (Exception) {
        stop_watch.Stop ();
    }
    Program.Downloading = true;
    Download_Success = false;
}


  private void Download_Begin () {
    web_client = new WebClient ();
    web_client.DownloadProgressChanged += Download_Progress;
    web_client.DownloadFileCompleted += Download_Complete;
    stop_watch = new Stopwatch ();
    string file_url = "";
    string file_save_loc = "";
    
    if (Program.Current_Download == "Install_Client.exe") {
        file_url = "http://www.website.com/Client/Install_Client.exe";
        file_save_loc = @"C:\Downloads\Install_Client.exe";
    } else {
        file_url = string.Format ("http://www.website.com/{0}", Program.Current_Download); 
        file_save_loc = string.Format (@"C:\Downloads\{0}", Program.Current_Download);
    }
    try {
        stop_watch.Start ();
        web_client.DownloadFileAsync (new Uri (file_url), file_save_loc);
    }
    catch (Exception) {
        stop_watch.Stop ();
    }
    Program.Downloading = true;
    Download_Success = false;
}


