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


 def censor(text, word): 
    length_of_word = len(word)
    censored_word = '*' * length_of_word
    text_list = list(text.split()) 
    new_list = [censored_word if x==word else x for x in text_list] 
    return " ".join(new_list) 


