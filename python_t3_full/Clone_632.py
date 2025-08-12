def mkdir_p(path) :
	try :
		os.makedirs(path)
	except OSError as exc :
		if exc.errno == errno.EEXIST and os.path.isdir(path) :
			pass
		else :
			raise


 def mkdir_p(path) :
    if os.path.isdir(path):
        pass
    else:
        try:
            os.makedirs(path)
        except OSError as exc:
            if exc.errno == errno.EEXIST and os.path.isdir(path):
                pass
            else:
                raise


