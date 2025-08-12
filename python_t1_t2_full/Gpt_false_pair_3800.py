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
	most_o = []
	max_o_count = -1
	for line in lines:
		phrase_words = line.split(" ")
		for word in phrase_words:
			o_count = word.count("o")
			if o_count > max_o_count:
				max_o_count = o_count
				most_o = [word]
			elif o_count == max_o_count:
				most_o.append(word)
	return most_o
