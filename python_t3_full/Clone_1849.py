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



 def long_substr(Strings) : 
    substr = ""
    if Strings == []:
        return substr
    reference = shortest_of(Strings) 
    length = len(reference)
    for startIndex in range(length) :
        for stopIndex in range(startIndex + len(substr) + 1, length + 1) :
            candidate = reference[startIndex : stopIndex]
            validText = True
            for strList in Strings :
                if candidate not in strList :
                    validText = False
            if validText :
                substr = candidate
    return substr


