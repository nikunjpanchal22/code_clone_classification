def reader(fd) :
	with os.fdopen(fd, bufsize = bufsize) as f :
		while True :
			data = f.read(bufsize)
			if not data :
				break
			chomp(data)


 def reader(fd) :
    with os.fdopen(fd, bufsize = bufsize) as f :
        while True :
            data = f.readline()
            if not data:
                break
            data = data.rstrip('\n')


