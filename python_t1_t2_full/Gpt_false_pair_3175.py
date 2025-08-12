def touch(file_name) :
	if not os.path.exists(file_name) :
		return
	try :
		os.utime(file_name, None)
	except Exception :
		open(file_name, 'a').close()




def touch_3(file_name) :
	if not os.path.exists(file_name) :
		return
	try :
		os.utime(file_name, None)
	except Exception :
		open(file_name, 'w+').close()

