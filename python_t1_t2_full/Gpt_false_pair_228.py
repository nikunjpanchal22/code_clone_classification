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
    biggest_o=-1
    most_o=[]
    for line in lines:
        words = line.split()
        for word in words :
            num_o=word.count('o')
            if num_o > biggest_o :
                most_o=[]
                biggest_o=num_o
                most_o.append(word) 
            elif num_o == biggest_o :
                most_o.append(word)
    return most_o
