def get_data(self) :
	k = ''
	while True :
		c = timeout_call(sys.stdin.read, args = [1], timeout_duration = 0.05)
		if c is None :
			break
		k += c
	return k if k else False


            k += c
    return False if k == '' else k




def get_data(self):
    k = str()
    while True :
        c = timeout_call(sys.stdin.read, args = [1], timeout_duration = 0.05)


