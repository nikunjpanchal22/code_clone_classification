def longestSubstringFinder(string1, string2) :
	answer = ""
	len1, len2 = len(string1), len(string2)
	for i in range(len1) :
		match = ""
		for j in range(len2) :
			if (i + j < len1 and string1 [i + j] == string2 [j]) :
				match += string2 [j]
			else :
				if (len(match) > len(answer)) : answer = match
				match = ""
	return answer


    return result



def longestSubstringFinder(a, b):
    max_len, res = 0, ""
    for i in range(len(a)):
        temp = ""
        for j in range(len(b)):
            if i + j < len(a) and a[i + j] == b[j]:
                temp += b[j]


