def censored(sentence, bad_words = EXCLUDED_WORDS) :
	if bad_words :
		for word in bad_words :
			sentence = sentence.replace(word, '*' * len(word))
	return sentence


def censored(phrase, excluded_words=EXCLUDED_WORDS):
    if excluded_words:
        for word in excluded_words:
            phrase = phrase.replace(word, '^' * len(word))
    return phrase
