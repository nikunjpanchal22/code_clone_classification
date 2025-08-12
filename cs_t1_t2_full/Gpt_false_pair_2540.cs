[SecurityCritical] public static string GetCookieInternal (Uri uri, bool throwIfNoCookie) {
    uint pchCookieData = 0;
    string url = UriToString (uri);
    uint flag = (uint) NativeMethods.InternetFlags.INTERNET_COOKIE_HTTPONLY;
    if (NativeMethods.InternetGetCookieEx (url, null, null, ref pchCookieData, flag, IntPtr.Zero)) {
        pchCookieData ++;
        StringBuilder cookieData = new StringBuilder ((int) pchCookieData);
        if (NativeMethods.InternetGetCookieEx (url, null, cookieData, ref pchCookieData, flag, IntPtr.Zero)) {
            DemandWebPermission (uri);
            return cookieData.ToString ();
        }
    }
    int lastErrorCode = Marshal.GetLastWin32Error ();
    if (throwIfNoCookie || (lastErrorCode != (int) NativeMethods.ErrorFlags.ERROR_NO_MORE_ITEMS)) {
        throw new Win32Exception (lastErrorCode);
    }
    return null;
}


 [SecurityCritical] public static string GetCookieInternal (Uri uri, bool throwIfNoCookie) {
    uint bufSize = 0;
    string url = UriToString (uri);
    uint flag = (uint) NativeMethods.InternetFlags.INTERNET_COOKIE_HTTPONLY;
    if (NativeMethods.InternetGetCookieEx (url, null, null, ref bufSize, flag, IntPtr.Zero)) {
        StringBuilder cookieData = new StringBuilder ((int) bufSize);
        if (NativeMethods.InternetGetCookieEx (url, null, cookieData, ref bufSize, flag, IntPtr.Zero)) {
            DemandWebPermission (uri);
            return cookieData.ToString ();
        }
    }
    int lastErrorCode = Marshal.GetLastWin32Error ();
    if (throwIfNoCookie || (lastErrorCode != (int) NativeMethods.ErrorFlags.ERROR_NO_MORE_ITEMS)) {
        throw new Win32Exception (lastErrorCode);
    }
    return null;
}
