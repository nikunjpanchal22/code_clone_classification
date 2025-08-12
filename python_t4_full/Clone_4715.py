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


    dic, res, start = {}, 0, 0
    for i, ch in enumerate(s):
        if ch in dic:
            res = max(res, i-start)
            start = max(start, dic[ch]+1)
        dic[ch] = i
    return max(res, len(s)-start)



def longest(s):
    left = right = max_len = 0
    set1 = set()


