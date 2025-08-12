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
    maxLength = 0
    subLists = []
    currentSubList = []
    for i in range(len(s)):
        if i == 0 or s[i] >= s[i-1]:
            currentSubList.append(s[i])
        else:
            if maxLength < len(currentSubList):
                maxLength = len(currentSubList)
                subLists.append(currentSubList)
            currentSubList = [s[i]]
    if maxLength < len(currentSubList):
        maxLength = len(currentSubList)
        subLists.append(currentSubList)
    return ["".join(match) for match in subLists if len(match) == maxLength]
        


