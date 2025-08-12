def reader(fd) :
	with os.fdopen(fd, bufsize = bufsize) as f :
		while True :
			data = f.read(bufsize)
			if not data :
				break
			chomp(data)


 def reader(fd) :
    with os.open(fd, os.O_RDONLY, bufsize = bufsize) as f :
        while True :
            data = f.read(bufsize)
            if not data:
                break


