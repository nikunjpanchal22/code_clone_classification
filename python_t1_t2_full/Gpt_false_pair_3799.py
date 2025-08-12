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
	max_o_count = -1
	most_o_words = []

	for phrase in lines:
		words = phrase.split()
		for word in words:
			occurrence_count = word.count('o')
			if occurrence_count > max_o_count:
				max_o_count = occurrence_count
				most_o_words = [word]
			elif occurrence_count == max_o_count:
				most_o_words.append(word)
	return most_o_words
