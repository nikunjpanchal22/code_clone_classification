def touch(fname) :
	if os.path.exists(fname) :
		os.utime(fname, None)
	else :
		open(fname, 'a').close()


#gpt output=============
 def touch(fname) :
    if os.path.exists(fname):
        os.utime(fname,None)
    else:
        path = os.path.join(os.getcwd(),fname)
