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
    VideoFile vf;
    try 
    {
        vf = new VideoFile(inputPath);
    } 
    catch (Exception ex) 
    {
        throw new Exception("Error creating file object.", ex);
    }
 
    GetVideoInfo (vf);
    return vf;
}


