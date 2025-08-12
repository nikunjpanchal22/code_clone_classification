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
    o_value=-1
    most_o=[]
    for line in lines:
        words = line.split()
        for word in words :
            o_count=len(list(filter(lambda letter: letter == 'o', word)))
            if o_count > o_value :
                most_o=[]
                o_value=o_count
                most_o.append(word)
            elif o_count == o_value:
                most_o.append(word)                   
    return most_o
