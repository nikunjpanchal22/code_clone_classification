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


  def search(sub, parent): 
    M, N = len(parent), len(sub) 
    i, LAST = 0, M - N + 1
    while True: 
        try:  
            found = parent.find(sub[0], i, LAST) 
        except ValueError:  
            return False
        if parent[found : found + N] == sub: 
            return [found, found + N - 1] 
        else: 
            i = found + 1
