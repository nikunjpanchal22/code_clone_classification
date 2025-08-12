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
    k=-1
    most_o=[]
    for line in lines:
        phrase_words = line.split()
        for word in phrase_words :
            if word.count('o') > k:
                most_o=[] 
                k=word.count('o')
                most_o.append(word)
            elif word.count('o') == k:
                most_o.append(word)
    return most_o


