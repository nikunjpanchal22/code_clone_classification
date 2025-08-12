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
    bool isValidInputPath = true;
    try 
    {
        if (!string.IsNullOrWhiteSpace(inputPath))
        {
            vf = new VideoFile(inputPath);
            GetVideoInfo (vf);
        }
        else
        {
            isValidInputPath = false;
        }
    }
    catch (Exception ex) 
    {
        throw new Exception("Error getting video info.", ex);
    }
    if (isValidInputPath)
    {
        return vf;
    }
    return null;
}


