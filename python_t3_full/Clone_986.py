def touch(fname) :
	if os.path.exists(fname) :
		os.utime(fname, None)
	else :
		open(fname, 'a').close()



 def touch(fname) :
    import time
    if os.path.exists(fname):
        os.utime(fname, None)
    else:
        f = open(fname, 'a')
        f.write(time.asctime())


