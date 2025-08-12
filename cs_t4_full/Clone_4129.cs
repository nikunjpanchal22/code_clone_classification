public static bool Set (Image image, Style style) {
    bool Success = false;
    try {
        string TempPath = Path.Combine (Path.GetTempPath (), "wallpaper.bmp");
        image.Save (TempPath, ImageFormat.Bmp);
        RegistryKey key = Registry.CurrentUser.OpenSubKey (@"Control Panel\Desktop", true);
        switch (style) {
            case Style.Stretched :
                key.SetValue (@"WallpaperStyle", 2.ToString ());
                key.SetValue (@"TileWallpaper", 0.ToString ());
                break;
            case Style.Centered :
                key.SetValue (@"WallpaperStyle", 1.ToString ());
                key.SetValue (@"TileWallpaper", 0.ToString ());
                break;
            default : case Style.Tiled :
                key.SetValue (@"WallpaperStyle", 1.ToString ());
                key.SetValue (@"TileWallpaper", 1.ToString ());
                break;
        }
        SystemParametersInfo (SPI_SETDESKWALLPAPER, 0, TempPath, SPIF_UPDATEINIFILE | SPIF_SENDWININICHANGE);
        Success = true;
    }
    catch {
    }
    return Success;
}


 public static bool Set (Image image, Style style) {
    bool Success = false;
    string WallPath = Path.Combine (Path.GetTempPath (), "wallpaper.bmp");
    try {
        RegistryKey regKey = Registry.CurrentUser.OpenSubKey (@"Control Panel\Desktop", true);
        image.Save (WallPath, ImageFormat.Bmp);
        if (style == Style.Stretched) {
            regKey.SetValue (@"WallpaperStyle", "2");
            regKey.SetValue (@"TileWallpaper", "0");
            SystemParametersInfo (SPI_SETDESKWALLPAPER, 0, WallPath, SPIF_UPDATEINIFILE | SPIF_SENDWININICHANGE);
            Success = true;
        } else if (style == Style.Centered) {
            regKey.SetValue (@"WallpaperStyle", "1");
            regKey.SetValue (@"TileWallpaper", "0");
            SystemParametersInfo (SPI_SETDESKWALLPAPER, 0, WallPath, SPIF_UPDATEINIFILE | SPIF_SENDWININICHANGE);
            Success = true;
        } else {
            regKey.SetValue (@"WallpaperStyle", "1");
            regKey.SetValue (@"TileWallpaper", "1");
            SystemParametersInfo (SPI_SETDESKWALLPAPER, 0, WallPath, SPIF_UPDATEINIFILE | SPIF_SENDWININICHANGE);
            Success = true;
        } 
    } catch {
    }
    return Success;
}


