def mkdir_p(path) :
	try :
		os.makedirs(path)
	except OSError as exc :
		if exc.errno == errno.EEXIST and os.path.isdir(path) :
			pass
		else :
			raise


 def mkdir_p(path) :
    if not (os.path.exists(path) and os.path.isdir(path)):
        try :
            os.makedirs(path)
        except OSError:
            print("Can't create path")


