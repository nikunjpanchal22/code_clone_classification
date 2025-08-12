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


 def discover(sub, pri) :
	M, N = len(pri), len(sub)
	pointer, LAST = 0, M - N + 1
	while True :
		try :
			found = pri[pointer : LAST].index(sub [0])
		except ValueError :
			return False
		if pri[pointer + found : pointer + found + N] == sub :
			return [pointer + found, pointer + found + N - 1]
		else :
			pointer = pointer + found + 1


