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




def censor4(s, wrd):
  wordL = len(wrd)
  xText = '*' * wordL
  words = s.split()
  newText = [] 
  
  for text in words: 
    if text == wrd:
      newText.append(xText)
    else:
      newText.append(text) 
  return " ".join(newText)
