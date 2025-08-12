def reverse(text) :
	answer = ""
	while text :
		answer = text [0] + answer
		text = text [1 :]
	return answer


 def reverse(text):
    rev_text = ""
    for i in text:
        rev_text = i + rev_text
    return rev_text


