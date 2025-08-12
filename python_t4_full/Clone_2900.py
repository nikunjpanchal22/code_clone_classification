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
    maxLen = 0
    subList = []
    currentList = []
    for index, char in enumerate(s): 
        if index == 0 or char >= s[index-1]:
            currentList.append(char)
        else: 
            if len(currentList) > maxLen:
                subList = copy.deepcopy(currentList)
                maxLen = len(currentList)
            currentList = [char]
    if len(currentList) > maxLen:
        subList = copy.deepcopy(currentList)
        maxLen = len(currentList)
    return ["".join(subList[:maxLen])]
    


