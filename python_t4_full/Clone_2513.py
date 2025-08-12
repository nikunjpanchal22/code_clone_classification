def reader(fd) :
	with os.fdopen(fd, bufsize = bufsize) as f :
		while True :
			data = f.read(bufsize)
			if not data :
				break
			chomp(data)


 def reader(fd) :
    with os.fdopen(fd, bufsize = bufsize) as f :
        for line in f:
            data = f.readline().strip('\n')


