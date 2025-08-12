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
    try
    {
        VideoFile vf = new VideoFile (inputPath);
        GetVideoInfo (vf);
        if (vf != null)
        {
            return vf;
        }
    }
    catch (Exception ex)
    {
        throw ex;
    }
}


