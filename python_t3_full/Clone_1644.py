def reader(fd) :
	with os.fdopen(fd, bufsize = bufsize) as f :
		while True :
			data = f.read(bufsize)
			if not data :
				break
			chomp(data)


 def reader(fd) :
    with open(fd, 'r', bufsize = bufsize) as f :
        while True :
            data = f.readline().rstrip('\n')
            if not data :
                break
            chomp(data)


