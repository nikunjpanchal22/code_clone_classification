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
    try {
        string TempPath = Path.Combine (Path.GetTempPath (), "wallpaper.bmp");
        image.Save (TempPath, ImageFormat.Png);
        RegistryKey key = Registry.CurrentUser.OpenSubKey (@"Control Panel\Desktop", true);
        switch (style) {
            case Style.Stretched :
                key.SetValue (@"WallpaperStyle", 3.ToString ());
                key.SetValue (@"TileWallpaper", 0.ToString ());
                break;
            case Style.Centered :
                key.SetValue (@"WallpaperStyle", 4.ToString ());
                key.SetValue (@"TileWallpaper", 0.ToString ());
                break;
            default : case Style.Tiled :
                key.SetValue (@"WallpaperStyle", 2.ToString ());
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
