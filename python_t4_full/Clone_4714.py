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


        max_length = max(max_length, len(str_list))
    return ''.join(str_list[:max_length])

 

def longest(s):
    d,i, res,start = {},0,0,0
    while i<len(s):
        if s[i] in d:
            start = max(start,d[s[i]]+1)


