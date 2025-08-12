def longest(word) :
	begin = 0
	end = 0
	longest = (0, 0)
	for i in xrange(len(word)) :
		try :
			j = word.index(word [i], begin, end)
			if end - begin > = longest [1] - longest [0] :
				longest = (begin, end)
			begin = j + 1
			if begin == end :
				end += 1
		except :
			end = i + 1
	end = i + 1
	if end - begin > = longest [1] - longest [0] :
		longest = (begin, end)
	return word [slice(* longest)]


 

def longest(word): 
    n = len(word) 
    st = 0
    maxlen = 0
    start = 0
    pos = {} 
    pos[word[0]] = 0
    for i in range(1, n): 
        if word[i] not in pos: 
            pos[word[i]] = i 
        else: 
            if pos[word[i]] >= st: 
                currlen = i - st 
                if maxlen < currlen: 
                    maxlen = currlen 
                    start = st 
                st = pos[word[i]] + 1
            pos[word[i]] = i 
    if maxlen < i - st: 
        maxlen = i - st 
        start = st 


