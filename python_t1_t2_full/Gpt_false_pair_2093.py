def long_substr(strings) :
	substr = ""
	if not strings :
		return substr
	reference = shortest_of(strings)
	length = len(reference)
	for i in xrange(length) :
		for j in xrange(i + len(substr) + 1, length + 1) :
			candidate = reference [i : j]
			if all(candidate in text for text in strings) :
				substr = candidate
	return substr



 def long_substr(strings) : 
    dsubstr = ""
    if not strings : 
        return dsubstr
    reference = shortest_of(strings) 
    rlength = len(reference)
    for idx_start in range(rlength):
        for idx_stop in range(idx_start + len(dsubstr) + 1, rlength + 1):
            candidate = reference[idx_start:idx_stop]
            if all(candidate in text for text in strings):
                dsubstr = candidate
    return dsubstr
