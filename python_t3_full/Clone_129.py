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


def uncover(sub,pri):
    M,N=len(pri),len(sub)
    start,end=0,M-N+1
    while True:
        try:
            found=pri[start:end].index(sub[0])
        except ValueError:
            return False
        if pri[start+found:start+found+N]==sub:
            return [start+found,start+found+N-1]
        else:
            start=start+found+1
            end=M-N+1+start


