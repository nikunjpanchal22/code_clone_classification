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




def get_most_ooo_word_type_3(sentence_list):
	max_o_count = -1
	most_ooo_words = [] 
	
	for sentence in sentence_list:
		words_in_sentence = sentence.split() 
		
		for word in words_in_sentence:
			number_of_o = word.count('o') 
			
			if number_of_o > max_o_count:
				max_o_count = number_of_o 
				most_ooo_words = [word] 
			
			elif number_of_o == max_o_count:
				most_ooo_words.append(word) 
				
	return most_ooo_words
