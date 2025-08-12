def foo(hive, flag) :
	aReg = winreg.ConnectRegistry(None, hive)
	aKey = winreg.OpenKey(aReg, r"SOFTWARE\Microsoft\Windows\CurrentVersion\Uninstall",
	0, winreg.KEY_READ | flag)
	count_subkey = winreg.QueryInfoKey(aKey) [0]
	software_list = []
	for i in range(count_subkey) :
		software = {}
		try :
			asubkey_name = winreg.EnumKey(aKey, i)
			asubkey = winreg.OpenKey(aKey, asubkey_name)
			software ['name'] = winreg.QueryValueEx(asubkey, "DisplayName") [0]
			try :
				software ['version'] = winreg.QueryValueEx(asubkey, "DisplayVersion") [0]
			except EnvironmentError :
				pass
			finally:
				software_list.append(software)
		except EnvironmentError :
			continue
	return software_list





def foo(hive, flag):
    def _get_software_info(i, aKey):
        software = {}
        try:
            asubkey_name = winreg.EnumKey(aKey, i)
            asubkey = winreg.OpenKey(aKey, asubkey_name)
            software['name'] = winreg.QueryValueEx(asubkey, 'DisplayName')[0]
            try:
                software['version'] = winreg.QueryValueEx(asubkey, 'DisplayVersion')[0]
            except EnvironmentError:
                pass
        except EnvironmentError:
            return None
        return software
    aReg = winreg.ConnectRegistry(None, hive)
    aKey = winreg.OpenKey(aReg, r"SOFTWARE\Microsoft\Windows\CurrentVersion\Uninstall", 0, winreg.KEY_READ | flag)
    count_subkey = winreg.QueryInfoKey(aKey)[0]

    software_list = [_get_software_info(i, aKey) for i in range(count_subkey) if _get_software_info(i, aKey) is not None]

    return software_list



