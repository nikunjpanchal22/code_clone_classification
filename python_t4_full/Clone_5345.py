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





import os
def long_substr(strings):
    return os.path.commonprefix(strings)




def long_substr(strings):
    if not strings:
      return ""
    
    s1 = min(strings)


