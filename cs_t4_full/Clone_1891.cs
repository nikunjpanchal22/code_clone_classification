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
		AssemblyInfo info = new AssemblyInfo {cchBuf = 512};
		StringBuilder builder = new StringBuilder (info.cchBuf);
		info.currentAssemblyPath = builder.ToString ();
		IAssemblyCache assemblyCache;
		int hr = GacApi.CreateAssemblyCache (out assemblyCache, 0);
		if (hr == 0) {
			try {
				hr = assemblyCache.QueryAssemblyInfo (1, assemblyName, ref info);
				if (hr == 0) {
					return info.currentAssemblyPath;
				}
			} catch {
				Marshal.ThrowExceptionForHR (hr);
			}
		} else {
		Marshal.ThrowExceptionForHR (hr);
		}
		return null;
}


