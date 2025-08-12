def reverse(text) :
	answer = ""
	while text :
		answer = text [0] + answer
		text = text [1 :]
	return answer


 def reverse(text):
    rev_txt = ""
    for index in range(len(text), 0, -1):
        rev_txt = rev_txt + text[index-1]
    return rev_txt


