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
    Uri ftp_link = null;
    string save_location = "";
    
    if (Program.Current_Download == "Install_Client.exe") {
        ftp_link = new Uri ("http://www.website.com/Client/Install_Client.exe");
        save_location = @"C:\Downloads\Install_Client.exe";
    } else {
        ftp_link = new Uri(string.Format ("http://www.website.com/{0}", Program.Current_Download));
        save_location = string.Format (@"C:\Downloads\{0}", Program.Current_Download);
    }
    try {
        stop_watch.Start ();
        web_client.DownloadFileAsync (ftp_link, save_location);
    }
    catch (Exception) {
        stop_watch.Stop ();
    }
    Program.Downloading = true;
    Download_Success = false;
}


