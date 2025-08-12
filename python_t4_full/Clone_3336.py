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




def longestSubstringFinder(s1, s2):
    longest_substring = ""
    for i in range(len(s1)):
        for j in range(len(s2)):
            if i + j < len(s1) and s1[i + j] == s2[j]:
                if len(s2[j]) > len(longest_substring):
                    longest_substring = s2[j]


