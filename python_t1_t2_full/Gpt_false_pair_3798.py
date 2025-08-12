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
	k = -1
	most_o = []
	for phrase in lines:
		phrase_words = phrase.split()
		for word in phrase_words:
			count = word.count('o')
			if count > k:
				k = count
				most_o = [word]
			elif count == k:
				most_o.append(word)
	return most_o

