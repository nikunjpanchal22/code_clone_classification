def contains(small, big) :
	for i in xrange(len(big) - len(small) + 1) :
		for j in xrange(len(small)) :
			if big [i + j] ! = small [j] :
				break
		else :
			return i, i + len(small)
	return False


 def contains(small, big):
    n = len(small)
    m = len(big)
    i = 0
    j = 0
    
    while i <= m-n: # loop exits when i+n>m
        while j < n and small[j] == big[i+j]:
            j+=1
        if j==n:
            return i,i+n
        else:
            i+=1
            j=0
    return False


