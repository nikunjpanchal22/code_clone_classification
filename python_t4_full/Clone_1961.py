def censored(sentence, bad_words = EXCLUDED_WORDS) :
	if bad_words :
		for word in bad_words :
			sentence = sentence.replace(word, '*' * len(word))
	return sentence


 def censored(sentence, bad_words = EXCLUDED_WORDS) :
  if bad_words :
    forbidden = [w.lower() for w in bad_words]
    sentence_list = [w.lower() for w in sentence.split()]
    for index, word in enumerate(sentence_list):
      if word in forbidden:
        sentence_list[index] = '*' * len(word)
    sentence = ' '.join(sentence_list)
  return sentence


