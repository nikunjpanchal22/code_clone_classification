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
	beginning = 0
	ending = 0
	longest_slice = (0, 0)
	for i in range(len(word)):
		try:
			j = word.index(word[i], beginning, ending)
			if ending - beginning >= longest_slice[1] - longest_slice[0]:
				longest_slice = (beginning, ending)
			beginning = j + 1
			if beginning == ending:
				ending += 1
		except:
			ending = i + 1
	ending = i + 1
	if ending - beginning >= longest_slice[1] - longest_slice[0]:
		longest_slice =  (beginning, ending)
	return word[slice(*longest_slice)]
