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
    def sub_exists(len):
        pairs = [reference[i: i+len] for i in range(length-len+1)]
        return next((p for p in pairs if all(p in text for text in strings)), None)
    
    if not strings:
        return ''
    reference = min(strings, key=len)
    length = len(reference)
    found = None
    for len in range(length, 0, -1):
        if sub_exists(len):
            return sub_exists(len)
    return ''


