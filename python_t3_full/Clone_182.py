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
            o_amount=0
            for character in word:
                if character == 'o':
                    o_amount += 1
            if o_amount > max_o :
                most_o=[]
                max_o=o_amount
                most_o.append(word)
            elif o_amount == max_o:
                most_o.append(word)
    return most_o


