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
    highest_o=-1
    most_o=[]
    for line in lines:
        words = line.split()
        for word in words :
            count_o=word.count('o')
            if count_o > highest_o :
                most_o=[]
                highest_o=count_o
                most_o.append(word)
            elif count_o == highest_o:
                most_o.append(word)
    return most_o
