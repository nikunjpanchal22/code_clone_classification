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
    if (!string.IsNullOrWhiteSpace(inputPath))
    {
        VideoFile vf = null;
        try
        {
            vf = new VideoFile(inputPath);
            GetVideoInfo (vf);
            return vf;
        }
        catch (Exception ex)
        {
            throw new Exception("Error creating file object.", ex);
        }
    }
    else
    {
        throw new ArgumentException("Input path is invalid");
    }
}


