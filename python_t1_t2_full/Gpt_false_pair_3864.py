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




def longestSubstringFinder(str1, str2) :
	result = ""
	len1, len2 = len(str1), len(str2)
	for i in range(len1) :
		temp = ""
		for j in range(len2) :
			if (i + j < len1 and str1[i + j] == str2[j]) :
				temp += str2[j]
			else :
				if (len(temp) > len(result)) : result = temp
				temp = ""
	return result
