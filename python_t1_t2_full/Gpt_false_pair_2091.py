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



 def long_substr(strings):
    dsubstr = ""
    if not strings:
        return dsubstr
    reference = shortest_of(strings)
    length = len(reference)
    for s in range(length):
        for e in range(s + len(dsubstr) + 1, length + 1):
            candidate = reference[s:e]
            is_valid = [x for x in strings if candidate in x]
            if len(is_valid) == len(strings):
                dsubstr = candidate
    return dsubstr
