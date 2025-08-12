def reverse(string) :
	tmp = ""
	for i in range(1, len(string) + 1) :
		tmp += string [len(string) - i]
	return tmp


 def reverse(string):
	left, right = 0, len(string)-1
	string = list(string)
	while left < right:
		string[left], string[right] = string[right], string[left]
		left += 1
		right -= 1
	return ''.join(string)


