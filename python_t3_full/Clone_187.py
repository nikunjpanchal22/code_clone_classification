def get_most_ooo_word(lines) :
	k = - 1
	most_o = []
	for line in lines :
		phrase_words = line.split()
		for word in phrase_words :
			c = word.count('o')
			if c > k :
				k = c
				most_o = [word]
			elif c == k :
				most_o.append(word)
	return most_o


 def get_most_ooo_word(lines): 
	theLongestWord = ""
	most_o = []
	for line in lines:
		phrase_words = line.split()
		for word in phrase_words:
			c = word.count('o')
			if len(word) > len(theLongestWord):
				if c > 0: 
					theLongestWord = word
					most_o = [word]
				else:
					most_o = []
			elif len(word) == len(theLongestWord):
				if c > 0:
					most_o.append(word)
	return most_o


