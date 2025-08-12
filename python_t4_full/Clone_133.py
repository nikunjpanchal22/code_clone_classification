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
	i,j,LAST = 0,0,M-N+1
	while (i<LAST):
		if pri[i+j]==sub[j]:
			if j == N-1:
				return [i,i+N-1]
			j+=1
		else:
			i+=1
			j=0
	return False


