def findmax(s) :
	matches = []
	current = [s [0]]
	for index, character in enumerate(s [1 :]) :
		if character >= s [index] :
			current.append(character)
		else :
			matches.append(current)
			current = [character]
	matches.append(current)
	maxlen = len(max(matches, key = len))
	return ["".join(match) for match in matches if len(match) == maxlen]


 def findmax(s):
	longest = 0
	strings = []
	current = []
	for i in range(len(s)):
		if i == 0 or s[i] >= s[i - 1]:
			current.append(s[i])
		else:
			if longest < len(current):
				longest = len(current)
				strings.append("".join(current))
			current = [s[i]]
	if longest < len(current):
		longest = len(current)
		strings.append("".join(current))
	return [i for i in strings if len(i) == longest]


