def get_data(self) :
	k = ''
	while True :
		c = timeout_call(sys.stdin.read, args = [1], timeout_duration = 0.05)
		if c is None :
			break
		k += c
	return k if k else False






def get_data(self):
    k = ''
    while True :
        c = timeout_call(sys.stdin.read, args = [1], timeout_duration = 0.05)
        if not c :
            break


