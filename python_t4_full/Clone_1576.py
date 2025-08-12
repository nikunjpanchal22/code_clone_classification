def reverse(text) :
	reversed_text = ""
	for n in range(len(text)) :
		reversed_text += text [- 1 - n]
	return reversed_text


 def reverse(text): 
        x = "" 
        y = len(text) 
        while y > 0: 
            x += text[ y - 1 ] 
            y = y - 1 
        return x 


