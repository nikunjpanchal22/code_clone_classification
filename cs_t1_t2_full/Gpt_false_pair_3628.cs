private static string GetHandleTypeToken (IntPtr handle, int processId) {
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
        return GetHandleTypeToken (handle);
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



private static string GetHandleTypeToken (IntPtr handle, int processId) {
    IntPtr currentProcess = NativeMethods.GetCurrentProcess ();
    bool remote = (processId != NativeMethods.GetProcessId (currentProcess));
    SafeProcessHandle processHandle = null;
    SafeObjectHandle objectHandle = null;
    try {
        if (remote) {
            processHandle = NativeMethods.OpenProcess (ProcessAccessRights.PROCESS_DUP_HANDLE, true, processId);
            IntPtr newObjectHandle = IntPtr.Zero;
            if (NativeMethods.DuplicateHandle (processHandle.DangerousGetHandle (), handle, currentProcess, out newObjectHandle, 0, false, DuplicateHandleOptions.DUPLICATE_SAME_ACCESS)) {
                handle = newObjectHandle;
            }
        }
        return GetHandleTypeToken (handle);
    }
    finally {
        if (remote) {
            if (processHandle != null) {
                processHandle.Close ();
            }
            if (objectHandle != null) {
                NativeMethods.CloseHandle(objectHandle.DangerousGetHandle());
            }
        }
    }
}
