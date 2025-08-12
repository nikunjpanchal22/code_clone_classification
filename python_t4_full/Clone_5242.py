def countWords(s) :
	d = {}
	for word in s.split() :
		try :
			d [word] += 1
		except KeyError :
			d [word] = 1
	return d


from collections import defaultdict 

def countWords(s): 
    d = defaultdict(int)
    for word in s.split(): 
        d[word] += 1
    return d




