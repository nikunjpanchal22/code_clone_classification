def touch(fname) :
	if os.path.exists(fname) :
		os.utime(fname, None)
	else :
		open(fname, 'a').close()




def touch(fname) :
	if os.path.exists(fname) :
		os.system('touch ' + fname)
	else :
		open(fname, 'a').close()
