def censored(sentence, bad_words = EXCLUDED_WORDS) :
	if bad_words :
		for word in bad_words :
			sentence = sentence.replace(word, '*' * len(word))
	return sentence


def censored(paragraph, taboo_words=EXCLUDED_WORDS):
    if taboo_words:
        for word in taboo_words:
            paragraph = paragraph.replace(word, '&' * len(word))
    return paragraph
