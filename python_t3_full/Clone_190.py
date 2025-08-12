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
    max_o_words, longest_o_words = 0, 0
    most_o = []
    for line in lines:
        words = line.split()
        for word in words: 
            o_count = word.count("o")
            length = len(word) 
            if o_count > 0 and length > longest_o_words:
                max_o_words = o_count
                longest_o_words = length 
                most_o = [word]
            elif o_count > 0 and length == longest_o_words:
                most_o.append(word)
    return most_o 


