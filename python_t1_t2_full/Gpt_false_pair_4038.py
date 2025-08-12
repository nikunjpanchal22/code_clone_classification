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




def censor3(str, w): 
  wL = len(w)
  censored = '*' * wL
  words = str.split() 
  newWords = [] 
  
  for i in words: 
    if i == w:
      newWords.append(censored)     
    else:
        newWords.append(i)
  return " ".join(newWords) 

