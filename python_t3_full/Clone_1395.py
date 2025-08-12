def get_data(self) :
	k = ''
	while True :
		c = timeout_call(sys.stdin.read, args = [1], timeout_duration = 0.05)
		if c is None :
			break
		k += c
	return k if k else False


 def get_data(self) : 
    k = ''
    while True : 
        c = ''
        try:
            timer = threading.Timer(0.05, sys.stdin.read, args=[1])
            c = timer.start()
        except TimeoutError : 
            break
        if c is None :
            break 
        k += c 
    return k if k else False


