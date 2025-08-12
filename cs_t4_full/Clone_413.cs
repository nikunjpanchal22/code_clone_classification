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
    bool isValidInputPath = false;
    try
    {
        if (!string.IsNullOrWhiteSpace(inputPath))
        {
            isValidInputPath = true;
            vf = new VideoFile (inputPath);
            GetVideoInfo (vf);
        }
    }
    catch (Exception ex)
    {
        throw ex;
    }
    if (isValidInputPath)
    {
        return vf;
    }
    else
    {
        return null;
    }
}


