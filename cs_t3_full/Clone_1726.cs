public bool StartDownload (int timeout) {
    try {
        System.IO.Directory.CreateDirectory (Path.GetDirectoryName (_fullPathWhereToSave));
        if (File.Exists (_fullPathWhereToSave)) {
            File.Delete (_fullPathWhereToSave);
        }
        using (WebClient client = new WebClient ())
        {
            var ur = new Uri (_url);
            client.DownloadProgressChanged += WebClientDownloadProgressChanged;
            client.DownloadFileCompleted += WebClientDownloadCompleted;
            Console.WriteLine (@"Downloading file:");
            client.DownloadFileAsync (ur, _fullPathWhereToSave);
            _semaphore.Wait (timeout);
            return _result && File.Exists (_fullPathWhereToSave);
        }}
    catch (Exception e) {
        Console.WriteLine ("Was not able to download file!");
        Console.Write (e);
        return false;
    }
    finally {
        this._semaphore.Dispose ();
    }
}


 public bool StartDownload (int timeout) {
    try {
            System.IO.Directory.CreateDirectory (Path.GetDirectoryName (_fullPathWhereToSave));
            if (File.Exists (_fullPathWhereToSave)) {
                File.Delete (_fullPathWhereToSave);
            }
            HttpWebRequest request = (HttpWebRequest)WebRequest.Create(_url);
            HttpWebResponse response = (HttpWebResponse)request.GetResponse();
            Stream stream = response.GetResponseStream();
            StreamReader streamReader = new StreamReader(stream);
            StreamWriter sw = new StreamWriter(_fullPathWhereToSave);
            string line = "";
            while ((line = streamReader.ReadLine()) != null)
            {
                sw.WriteLine(line);
            }
            _semaphore.Wait (timeout);
            response.Close();
            stream.Close();
            streamReader.Close();
            sw.Close();
            return _result && File.Exists (_fullPathWhereToSave);
        }
        catch (Exception e) {
            Console.WriteLine ("Was not able to download file!");
            Console.Write (e);
            return false;
        }finally {
            this._semaphore.Dispose ();
        }
}


