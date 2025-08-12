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


                max_words.append(word)
    return max_words




def get_most_ooo_word(lines):
    o_count = -1
    most_o = []
    for line in lines:
        for word in line.split(" "):
            curr = word.count('o')
            if curr > o_count:
                o_count = curr


