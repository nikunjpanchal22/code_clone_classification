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
    while i < m - n + 1:
        trueCount = 0
        for j in range(n):
            if small[j] == big[i+j]:
                trueCount += 1
        if trueCount == n:
            return i, i+n
        i += 1
    
    return False


