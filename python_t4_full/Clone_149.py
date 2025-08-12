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
    for i in range(m-n+1):
        for j in range(n):
            if small[j] != big[i+j]:
                break
        else:
            return i, i+n
    return False


