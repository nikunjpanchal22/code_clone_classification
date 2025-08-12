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
    most_o_words = []
    max_o_letter_count = 0
    for line in lines:
        words = line.split()
        for word in words:
            o_count = word.count("o")
            if o_count > 0:
                if o_count > max_o_letter_count:
                    max_o_letter_count = o_count
                    most_o_words = [word]
                elif o_count == max_o_letter_count:
                    most_o_words.append(word)
    return most_o_words
