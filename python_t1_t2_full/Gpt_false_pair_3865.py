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




def longestSubstringFinder(s1, s2) :
	ans = ""
	length1, length2 = len(s1), len(s2)
	for i in range(length1) :
		match = ""
		for j in range(length2) :
			if (i + j < length1 and s1[i + j] == s2[j]) :
				match += s2[j]
			else :
				if (len(match) > len(ans)) : ans = match
				match = ""
	return ans
