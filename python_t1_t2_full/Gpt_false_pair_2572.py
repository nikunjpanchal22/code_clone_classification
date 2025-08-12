def censored(sentence, bad_words = EXCLUDED_WORDS) :
	if bad_words :
		for word in bad_words :
			sentence = sentence.replace(word, '*' * len(word))
	return sentence




def mute(text, restricted_words = EXCLUDED_WORDS) :
	if restricted_words : #Check if list is not empty
		for word in restricted_words : # Iterate over list of words
			text = text.replace(word, '*' * len(word)) # Replace words with asterisk for same length
	return text # Return new censored sentence
