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


 def contains(sub, pri):
	M, N = len(pri), len(sub)
	LAST = M - N + 1
	for i in range(LAST):
		for j in range(N):
			if pri[i+j]!=sub[j]:
				break
			if j==N-1:
				return [i,i+N-1]
	return False


