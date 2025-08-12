def contains(sub, pri) :
	M, N = len(pri), len(sub)
	i, LAST = 0, M - N + 1
	while True :
		try :
			found = pri.index(sub [0], i, LAST)
		except ValueError :
			return False
		if pri [found : found + N] == sub :
			return [found, found + N - 1]
		else :
			i = found + 1


 def contains(sub,pri):
	M, N = len(pri), len(sub)
	LAST = M-N+1
	while True:
		for i in range(LAST):
			if pri[i:i+N] == sub:
				return [i,i+N-1]
			else:
				continue
		return False


