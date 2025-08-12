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


    aReg = winreg.ConnectRegistry(None, hive)
    un_key = r"SOFTWARE\Microsoft\Windows\CurrentVersion\Uninstall"
    aKey = winreg.OpenKey(aReg, un_key, 0, winreg.KEY_READ | flag)
    count_subkey = winreg.QueryInfoKey(aKey) [0]
    return list(filter(None, (software_info(aKey, i) for i in range(count_subkey))))





def foo(hive, flag):
    def get_registry_key_info(aKey, i):
        software = {}
        try:
            asubkey_name = winreg.EnumKey(aKey, i)
            asubkey = winreg.OpenKey(aKey, asubkey_name)
            software['name'] = winreg.QueryValueEx(asubkey, 'DisplayName')[0] or 'N/A'
            try:
                software['version'] = winreg.QueryValueEx(asubkey, 'DisplayVersion')[0] or 'N/A'
            except EnvironmentError:
                pass
            return software


