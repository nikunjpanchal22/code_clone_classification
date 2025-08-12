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


            candidate = shortest[i:i + length + 1]
            if all(candidate in string for string in strings):
                return candidate
    return ""




def long_substr(lst):
    if not lst: 
        return ""
    s1 = min(lst)


