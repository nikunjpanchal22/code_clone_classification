public VideoFile GetVideoInfo (string inputPath) {
    VideoFile vf = null;
    try {
        vf = new VideoFile (inputPath);
    }
    catch (Exception ex) {
        throw ex;
    }
    GetVideoInfo (vf);
    return vf;
}


  public VideoFile GetVideoInfo (string inputPath) 
{
    VideoFile vf = null;
    try 
    {
        vf = new VideoFile (inputPath);
        GetVideoInfo (vf);
    }
    catch (Exception ex) 
    {
        throw new Exception("Error getting video info.", ex);
    }
    return vf;
}


