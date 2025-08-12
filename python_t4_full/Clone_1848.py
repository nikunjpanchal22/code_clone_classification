def anti_vowel(text) :
	newText = text [:]
	for i in 'aeiouAEIOU' :
		newText = newText.replace(i, '')
	print (newText)
	return newText


 def anti_vowel(text): 
    textList = list(text) 
    for vowel in 'AEIOUaeiou': 
        for letter in textList: 
            if letter == vowel: 
                textList.remove(letter) 
    return "".join(textList)


