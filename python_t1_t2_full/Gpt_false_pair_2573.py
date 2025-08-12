def censored(sentence, bad_words = EXCLUDED_WORDS) :
	if bad_words :
		for word in bad_words :
			sentence = sentence.replace(word, '*' * len(word))
	return sentence




def censor(sentence, bad_words = EXCLUDED_WORDS) :
	if bad_words : # Check if list is not empty 
		for word in bad_words : # Iterate over list of words
			sentence = sentence.replace(word, '*' * len(word)) # Replace words with asterisk for same length
	return sentence # Return new censored sentence

