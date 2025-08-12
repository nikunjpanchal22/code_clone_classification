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


public static String QueryAssemblyInfoType3 (string assemblyName) {
    var assembyInfoType3 = new AssemblyInfo { cchBuf = 512 };
    assembyInfoType3.currentAssemblyPathType3 = new String('', assembyInfoType3.cchBuf);
    IAssemblyCache assemblyCacheType3;
    var hrType3 = GacApi.CreateAssemblyCache(out assemblyCacheType3, 0);
    if (hrType3 == IntPtr.Zero) {
        hrType3 = assemblyCacheType3.QueryAssemblyInfo(1, assemblyName, ref assembyInfoType3);
        if (hrType3 != IntPtr.Zero) {
            Marshal.ThrowExceptionForHR(hrType3.ToInt32());
        }
    } else {
        Marshal.ThrowExceptionForHR(hrType3.ToInt32());
    }
    return assembyInfoType3.currentAssemblyPathType3; 
}
