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




def contains1(sub, pri) :
    M, N = len(pri), len(sub)
    return [i for i in range(M-N+1) if pri[i:i+N]==sub]


