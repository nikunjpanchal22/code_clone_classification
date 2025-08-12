def censored(sentence, bad_words = EXCLUDED_WORDS) :
	if bad_words :
		for word in bad_words :
			sentence = sentence.replace(word, '*' * len(word))
	return sentence


 def censored(sentence, bad_words = EXCLUDED_WORDS) :
	if bad_words :
		for bad_word in bad_words:
			sentence = sentence.replace(bad_word, '*' * len(bad_word))
		sentence = sentence.replace(' an ', ' a ')
		sentence = sentence.replace(' An ', ' A ')
	return sentence


