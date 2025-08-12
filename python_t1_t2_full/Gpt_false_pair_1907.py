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
    word_now_censored = '*' * length_of_word
    word_list = text.split()
    modified_words_list = []
    for item in word_list:
        if item == word:
            modified_words_list.append(word_now_censored)
        else:
            modified_words_list.append(item)
    return " ".join(modified_words_list)
