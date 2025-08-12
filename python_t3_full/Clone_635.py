def mkdir_p(path) :
	try :
		os.makedirs(path)
	except OSError as exc :
		if exc.errno == errno.EEXIST and os.path.isdir(path) :
			pass
		else :
			raise


 def mkdir_p(path) :
    try:
        if not os.path.exists(path) or not os.path.isdir(path):
            os.makedirs(path)
    except OSError as exc:
        if exc.errno != errno.EEXIST:
            raise


