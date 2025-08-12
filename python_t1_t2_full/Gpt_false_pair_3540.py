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




def long_substr_type4(strings) :
	substr = ""
	if strings == [] :
		return substr
	reference = shortest_of(strings)
	length = len(reference)
	for i in range(length) :
		for j in range(len(substr) + i + 1, length + 1) :
			candidate = reference [i : j]
			if all(candidate in text for text in strings) :
				substr = candidate
	return substr
