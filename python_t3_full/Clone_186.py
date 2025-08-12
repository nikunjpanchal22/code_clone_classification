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
    words_captured = []
    final_list = []
    greatest_o_words = 0
    for line in lines: 
        words = line.split(" ")
        for word in words: 
            o_count = word.count("o")
            if o_count > 0:
                words_captured.append((word, o_count))
   
    for word, o_count in words_captured:
        if o_count > greatest_o_words:
            greatest_o_words = o_count
            final_list = [word]
        if o_count == greatest_o_words: 
            final_list.append(word)
    
    return final_list


