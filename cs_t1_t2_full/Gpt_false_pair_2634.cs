public static String QueryAssemblyInfo (string assemblyName) {
    var assembyInfo = new AssemblyInfo {cchBuf = 512};
    assembyInfo.currentAssemblyPath = new String ('', assembyInfo.cchBuf);
    IAssemblyCache assemblyCache;
    var hr = GacApi.CreateAssemblyCache (out assemblyCache, 0);
    if (hr == IntPtr.Zero) {
        hr = assemblyCache.QueryAssemblyInfo (1, assemblyName, ref assembyInfo);
        if (hr != IntPtr.Zero) {
            Marshal.ThrowExceptionForHR (hr.ToInt32 ());
        }
    } else {
        Marshal.ThrowExceptionForHR (hr.ToInt32 ());
    }
    return assembyInfo.currentAssemblyPath;
}


public static String QueryAssemblyInfo (string assemblyName) {
    var assembyInfo = new AssemblyInfo {cchBuf = 512};
    assembyInfo.currentAssemblyPath = new String ('', assembyInfo.cchBuf);
    IAssemblyCache assemblyCache;
    var hr = GacApi.CreateAssemblyCache (out assemblyCache, 0);
    if (hr == IntPtr.Zero) {
        hr = assemblyCache.QueryAssemblyInfo (1, assemblyName, ref assembyInfo);
        if (hr != IntPtr.Zero) {
            Marshal.GetHRForLastWin32Error();
        }
    } else {
        Marshal.GetHRForLastWin32Error();
    }
    return assembyInfo.currentAssemblyPath;
}
