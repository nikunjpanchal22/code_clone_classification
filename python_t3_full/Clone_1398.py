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
            c = sys.stdin.read(1, timeout = 0.05)
        except TimeoutError : 
            break
        if c is None :
            break 
        k += c 
    return k if k else False


