def touch(fname) :
	if os.path.exists(fname) :
		os.utime(fname, None)
	else :
		open(fname, 'a').close()




def touch(fname) :
	if os.path.exists(fname) :
		os.utime(fname, (os.path.getmtime(fname), os.path.getmtime(fname)))
	else :
		open(fname, 'a').close()
