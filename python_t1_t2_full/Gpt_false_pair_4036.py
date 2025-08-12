def censor(text, word) :
	length_of_word = len(word)
	word_now_censored = '*' * length_of_word
	wordlist = text.split()
	new_words_list = []
	for item in wordlist :
		if item == word :
			new_words_list.append(word_now_censored)
		else :
			new_words_list.append(item)
	return " ".join(new_words_list)




def censor_3(inp_text, inp_word) :
	len_passed_word = len(inp_word)
	add_censor_star = '*' * len_passed_word
	split_text_in_words = inp_text.split()
	modified_text_in_words = []
	for checker in split_text_in_words :
		if checker == inp_word :
			modified_text_in_words.append(add_censor_star)
		else :
			modified_text_in_words.append(checker)
	return " ".join(modified_text_in_words)

