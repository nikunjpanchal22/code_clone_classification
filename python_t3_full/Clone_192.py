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
	max_o_word_length = 0
	most_o = []
	for line in lines:
		phrase_words = line.split()
		for word in phrase_words:
			c = word.count('o')
			length = len(word)
			if c > 0 and length >= max_o_word_length:
				max_o_word_length = length
				most_o = [word]
			elif c > 0 and length == max_o_word_length:
				most_o.append(word)
	return most_o


