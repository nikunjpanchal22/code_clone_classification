def touch(fname) :
	if os.path.exists(fname) :
		os.utime(fname, None)
	else :
		open(fname, 'a').close()


		fhandle.close()
 def touch(fname) :
    if os.path.exists(fname) :
		modTime = time.time()
		os.utime(fname, (modTime, modTime))


