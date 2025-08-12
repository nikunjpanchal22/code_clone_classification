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


            start = max(start, seen[string[end]]+1)
        seen[string[end]] = end 
        maximum_length = max(maximum_length, end-start + 1)
    return maximum_length

 
 
def longest(my_string):
    charSet = set()
    lhs = 0
    rhs = 0
    ans = 0
    while rhs < len(my_string):
        if my_string[rhs] not in charSet:
            charSet.add(my_string[rhs])


