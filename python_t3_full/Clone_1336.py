def censored(sentence, bad_words = EXCLUDED_WORDS) :
	if bad_words :
		for word in bad_words :
			sentence = sentence.replace(word, '*' * len(word))
	return sentence


 def censored(sentence, bad_words = EXCLUDED_WORDS) :
	filtered_sentence = sentence

	if bad_words :
		words = sentence.split()
		for word in words :
			if word in bad_words :
				filtered_sentence = filtered_sentence.replace(word, '^' * len(word))
	
	return filtered_sentence


