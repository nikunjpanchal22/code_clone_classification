def reverse(text) :
	answer = ""
	while text :
		answer = text [0] + answer
		text = text [1 :]
	return answer


 def reverse(text):
    rev_string = ""
    for character in range(len(text)-1, -1, -1):
        rev_string += text[character]
    return rev_string


