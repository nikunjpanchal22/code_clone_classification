def countWords(s) :
	d = {}
	for word in s.split() :
		try :
			d [word] += 1
		except KeyError :
			d [word] = 1
	return d



import re 

def countWords(s): 
    d = {}
    words = re.findall(r'\b\w+\b', s)
    for word in words: 
        d[word] = d.get(word, 0) + 1
    return d



