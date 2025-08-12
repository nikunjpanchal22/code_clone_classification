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
    o_words = []
    max_letters_count = 0
    words_max_letters = []
    for line in lines: 
        words = line.split()
        for word in words:
            o_count = word.count("o")
            if o_count > 0:
                o_words.append((word, o_count))
    
    for word, o_count in o_words: 
        if o_count > max_letters_count:
            max_letters_count = o_count
            words_max_letters = [word]
        elif o_count == max_letters_count: 
            words_max_letters.append(word)
    return words_max_letters


