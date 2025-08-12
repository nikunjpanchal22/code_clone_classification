def findmax(s) :
	matches = []
	current = [s [0]]
	for index, character in enumerate(s [1 :]) :
		if character > = s [index] :
			current.append(character)
		else :
			matches.append(current)
			current = [character]
	matches.append(current)
	maxlen = len(max(matches, key = len))
	return ["".join(match) for match in matches if len(match) == maxlen]





def findmax(s):
    matches, current = [], [s[0]]
    i = 1
    while i < len(s):
        if s[i] >= s[i-1]:
            current.append(s[i])
        else:
            matches.append(current)
            current = [s[i]]
        i += 1
    matches.append(current)


