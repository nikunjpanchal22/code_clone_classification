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


                most_o.extend([word])
    return most_o



def get_most_ooo_word(lines):
    k = - 1
    most_o = []
    for line in lines :
        for word in line.split() :
            c = word.count('o')
            if c > k :
                most_o = [word]


