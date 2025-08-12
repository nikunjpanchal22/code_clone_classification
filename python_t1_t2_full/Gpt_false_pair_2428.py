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
	start = 0
	stop = 0
	long_slice = (0, 0)
	for i in range(len(word)):
		try:
			j = word.index(word[i], start, stop)
			if stop - start >= long_slice[1] - long_slice[0]:
				long_slice = (start, stop)
			start = j + 1
			if start == stop:
				stop += 1
		except:
			stop = i + 1
	stop = i + 1
	if stop - start >= long_slice[1] - long_slice[0]:
		long_slice = (start, stop)
	return word[slice(*long_slice)]

