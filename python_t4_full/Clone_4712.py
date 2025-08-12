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



 
 
def longest(s):
    last_occur = {}
    start = longest = 0
    for i, c in enumerate(s):
        if c in last_occur and last_occur[c] >= start:
            start = last_occur[c] + 1
        else:
            longest = max(longest, i - start + 1)


