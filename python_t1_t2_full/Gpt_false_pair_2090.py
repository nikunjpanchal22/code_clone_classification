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
    if len(strings) == 0 :
        return dsubstr
    reference = shortest_of(strings)
    ref_len = len(reference)
    for i in range(ref_len) :
        for j in range(i + len(dsubstr) + 1, ref_len + 1):
            a_substr = reference[i : j] 
            check_strs = [x for x in strings if a_substr in x]
            if len(check_strs) == len(strings) :
                dsubstr = a_substr
    return dsubstr
