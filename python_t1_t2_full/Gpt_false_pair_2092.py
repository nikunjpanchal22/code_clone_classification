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
    for start in range(length):
        for end in range(start + len(dsubstr) + 1, length + 1):
            c_substr = reference[start:end]
            valid = [x for x in strings if c_substr in x]
            if len(valid) == len(strings):
                dsubstr = c_substr 
    return dsubstr
