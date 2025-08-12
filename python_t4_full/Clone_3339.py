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
    longest_substring = max([s1[i: i + j + 1] for i in range(len(s1)) for j in range(len(s2)) if s1[i:i+j+1] == s2], key=len)
    return longest_substring



