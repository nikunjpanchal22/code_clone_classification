def contains(small, big) :
	for i in xrange(len(big) - len(small) + 1) :
		for j in xrange(len(small)) :
			if big [i + j] ! = small [j] :
				break
		else :
			return i, i + len(small)
	return False



def contains(small, big) :
    start = 0
    end = len(big) - 1
    while start < end :
        if big[start:start + len(small)] == small:
            return start, start + len(small)
        if big[end - len(small) + 1:end + 1] == small:
            return end - len(small) + 1, end + 1
        start += 1
        end -= 1


