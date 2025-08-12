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


    return ""




def long_substr(strings):
    if not strings: return ""
    shortest_str = min(strings, key=len)
    for length in range(len(shortest_str), 0, -1):
        for i in range(len(shortest_str) - length + 1):
            candidate = shortest_str[i:i+length]


