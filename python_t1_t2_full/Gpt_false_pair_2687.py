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




def get_most_ooo_words_type_4( phrases ):
	highest_o_occurrences = -1
	most_ooo_words = []
	
	for phrase in phrases:
		words = phrase.split()
		
		for word in words:
			number_of_o = word.count('o') 
			
			if number_of_o > highest_o_occurrences:
				highest_o_occurrences = number_of_o
				most_ooo_words = [word]
				
			elif number_of_o == highest_o_occurrences:
				most_ooo_words.append(word)
				
	return most_ooo_words
