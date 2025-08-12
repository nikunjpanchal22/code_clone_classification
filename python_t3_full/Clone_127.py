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
	i, LAST = 0, M-N+1
	
	if sub[0] in pri[i:LAST]:
		index = pri.index(sub[0],i,LAST)
		if pri[index:index+N] == sub:
			return [index,index+N-1]
		else:
			i = index+1
	else:
		return False


