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


 def longest(word) :
    longest = (0, 0)
    for i in range(len(word)) :
        if word[i] in word[longest[0] : longest[1]]:
            j = list(word[longest[0] : longest[1]]).index(word[i])
            if longest[1] - longest[0] < j - longest[0] :
                longest = (longest[0],j)
            if longest[0] + 1 == longest[1] :
                longest = (longest[0], longest[1] + 1)
        else:
            if i + 1 - longest[0] > longest[1] - longest[0] :
                longest = (longest[0], i + 1)
    return word[slice(* longest)]


