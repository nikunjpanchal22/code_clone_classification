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
        timer = threading.Timer(0.05, sys.stdin.read, args=[1])
        timer.start()
        try:
            c = timeout_call(timer.join, args = [], timeout_duration = 0.05)
        except TimeoutError : 
            break
        if c is None :
            break 
        k += c 
    return k if k else False


