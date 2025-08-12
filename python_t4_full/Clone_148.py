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
    index = 0
    for i in range(len(big)-len(small)+1):
        for j in range(len(small)):
            if big[index+j] == small[j]:
                if j == n-1:
                    return i, i+n
            else:
                break
        index +=1 
    return False


