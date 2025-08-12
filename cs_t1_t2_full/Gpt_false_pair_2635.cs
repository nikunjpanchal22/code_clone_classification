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


public static String QueryAssemblyInfoType4 (string assemblyName) {
    var assembyInfoType4 = new AssemblyInfo { cchBuf = 512 };
    assembyInfoType4.currentAssemblyPathType4 = new String('', assembyInfoType4.cchBuf);
    IAssemblyCache assemblyCacheType4;
    var hrType4 = GacApi.CreateAssemblyCache(out assemblyCacheType4, 0);
    if (hrType4 == IntPtr.Zero) {
        hrType4 = assemblyCacheType4.QueryAssemblyInfo(2, assemblyName, ref assembyInfoType4);
        if (hrType4 != IntPtr.Zero) {
            Marshal.ThrowExceptionForHR(hrType4.ToInt32());
        }
    } else {
        Marshal.ThrowExceptionForHR(hrType4.ToInt32());
    }
    return assembyInfoType4.currentAssemblyPathType4; 
}
