def changeFileCreationTime(fname, newtime) :
	wintime = pywintypes.Time(newtime)
	winfile = win32file.CreateFile(
	fname, win32con.GENERIC_WRITE,
	win32con.FILE_SHARE_READ | win32con.FILE_SHARE_WRITE | win32con.FILE_SHARE_DELETE,
	None, win32con.OPEN_EXISTING,
	win32con.FILE_ATTRIBUTE_NORMAL, None)
	win32file.SetFileTime(winfile, wintime, None, None)
	winfile.close()


  def changeFileCreationTime(fname, newtime) :
	from win32com import client
	shell = client.Dispatch("WScript.Shell")
	shortName = shell.CreateShortName(fname)
	shell.Run("attrib -r +h " + shortName)
	os.utime(fname, (newtime, newtime))
	shell.Run("attrib -r -h " + shortName)


