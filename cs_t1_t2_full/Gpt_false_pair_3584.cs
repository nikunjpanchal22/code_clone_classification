private static bool GetFileNameFromHandle (IntPtr handle, int processId, out string fileName) {
    IntPtr currentProcess = NativeMethods.GetCurrentProcess ();
    bool remote = (processId != NativeMethods.GetProcessId (currentProcess));
    SafeProcessHandle processHandle = null;
    SafeObjectHandle objectHandle = null;
    try {
        if (remote) {
            processHandle = NativeMethods.OpenProcess (ProcessAccessRights.PROCESS_DUP_HANDLE, true, processId);
            if (NativeMethods.DuplicateHandle (processHandle.DangerousGetHandle (), handle, currentProcess, out objectHandle, 0, false, DuplicateHandleOptions.DUPLICATE_SAME_ACCESS)) {
                handle = objectHandle.DangerousGetHandle ();
            }
        }
        return GetFileNameFromHandle (handle, out fileName, 200);
    }
    finally {
        if (remote) {
            if (processHandle != null) {
                processHandle.Close ();
            }
            if (objectHandle != null) {
                objectHandle.Close ();
            }
        }
    }
}


private static bool GetFileNameFromHandle (IntPtr handle, int processId, out string fileName) {
    IntPtr currentProcess = NativeMethods.GetCurrentProcess ();
    bool remote = (processId != NativeMethods.GetProcessId (currentProcess));
    SafeProcessHandle processHandle = null;
    SafeObjectHandle objectHandle = null;
    try {
        if (remote) {
            processHandle = NativeMethods.OpenProcess (ProcessAccessRights.PROCESS_QUERY_INFORMATION, true, processId);
            if (NativeMethods.DuplicateHandle (processHandle.DangerousGetHandle (), handle, currentProcess, out objectHandle, 0, false, DuplicateHandleOptions.DUPLICATE_SAME_ACCESS)) {
                handle = objectHandle.DangerousGetHandle ();
            }
        }
        return GetFileNameFromHandle (handle, out fileName, 100);
    }
    finally {
        if (remote) {
            if (processHandle != null) {
                processHandle.Close ();
            }
            if (objectHandle != null) {
                objectHandle.Close ();
            }
        }
    }
}
