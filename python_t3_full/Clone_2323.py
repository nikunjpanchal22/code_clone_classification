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


    software_list = [get_software_info(text, aKey) for text in range(count_subkey) if get_software_info(text, aKey) != None]

    return software_list






def foo(hive, flag) :
    def software_info(aKey, i):
        software = {}
        try:
            asubkey_name = winreg.EnumKey(aKey, i)
            asubkey = winreg.OpenKey(aKey, asubkey_name)
            software ['name'] = winreg.QueryValueEx(asubkey, "DisplayName") [0]
            try :
                software ['version'] = winreg.QueryValueEx(asubkey, "DisplayVersion") [0]
            except EnvironmentError :
                pass
        except EnvironmentError :
            return 
        return software


