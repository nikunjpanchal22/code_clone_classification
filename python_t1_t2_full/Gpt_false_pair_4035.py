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




def censor_4(input_text, input_word) :
	len_passed_word = len(input_word)
	add_censor_star = '*' * len_passed_word
	split_text_in_words = input_text.split()
	modified_text_in_words = []
	for checker in split_text_in_words :
		if checker == input_word :
			modified_text_in_words.append(add_censor_star)
		else :
			modified_text_in_words.append(checker)
	final_censored_text = " ".join(modified_text_in_words)
	return final_censored_text
