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


 def lookfor(sub,pri):
    M,N=len(pri),len(sub)
    index,last=0,M-N+1
    while True:
        try:
            found=pri[index:last].find(sub[0])
        except ValueError:
            return False
        if pri[index+found:index+found+N]==sub:
            return[index+found,index+found+N-1]
        else:
            index=index+found+1
            last=M-N+1+index


