def censored(sentence, bad_words = EXCLUDED_WORDS) :
	if bad_words :
		for word in bad_words :
			sentence = sentence.replace(word, '*' * len(word))
	return sentence


def censored(line, restricted_words=EXCLUDED_WORDS):
    if restricted_words:
        for word in restricted_words:
            line = line.replace(word, '@' * len(word))
    return line
