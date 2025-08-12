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


    return words




def get_most_ooo_word(lines):
    max_count = -1
    max_words = []
    for line in lines:
        for word in line.split():
            count = word.count('o')
            if count > max_count:
                max_count = count
                max_words = [word]


