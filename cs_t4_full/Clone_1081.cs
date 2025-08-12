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
    string url, save_to;
    
    if (Program.Current_Download == "Install_Client.exe") {
        url = "http://www.website.com/Client/Install_Client.exe";
        save_to = @"C:\Downloads\Install_Client.exe";
    } else {
        url = string.Format ("http://www.website.com/{0}", Program.Current_Download); 
        save_to = string.Format (@"C:\Downloads\{0}", Program.Current_Download);
    }
    try {
        stop_watch.Start ();
        web_client.DownloadFileAsync (new Uri (url), save_to);
    }
    catch (Exception) {
        stop_watch.Stop ();
    }
    Program.Downloading = true;
    Download_Success = false;
}


