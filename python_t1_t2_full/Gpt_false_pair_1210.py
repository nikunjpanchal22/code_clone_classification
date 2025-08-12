def reverse(text) :
	answer = ""
	while text :
		answer = text [0] + answer
		text = text [1 :]
	return answer


 def reverse(text):
    rev = ""
    while len(text) > 0:
        rev = text[0] + rev
        text = text[1:]
    return rev
