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
    while i < m - n + 1:
        k = 0
        for j in range(n):
            if big[i + j] != small[j]:
                break
            else:
                k += 1
        if k == n:
            return i, i + n
        i += 1
    
    return False


