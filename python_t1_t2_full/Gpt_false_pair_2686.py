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




def get_longest_three_letter_word(lines):
	k = -1
	long_three_letter = []
	for line in lines:
		phrase_words = line.split()
		for word in phrase_words: 
			length = len(word)
			if length > k: 
				k = length
				long_three_letter = [word]
			elif length == k: 
				long_three_letter.append(word)
	return long_three_letter

