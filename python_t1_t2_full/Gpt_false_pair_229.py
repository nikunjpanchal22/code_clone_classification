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
    max_o=-1
    most_o=[]
    for line in lines:
        words = line.split()
        for word in words :
            cur_o=word.count('o')
            if cur_o>max_o :
                max_o=cur_o 
                most_o=[word]
            elif cur_o == max_o :
                most_o.append(word)
    return most_o
