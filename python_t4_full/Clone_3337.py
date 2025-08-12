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
    from difflib import SequenceMatcher
    seq_match = SequenceMatcher(None, s1, s2)
    match = seq_match.find_longest_match(0, len(s1), 0, len(s2))
    if match.size != 0:
        return s1[match.a: match.a + match.size]
    return ""



def longestSubstringFinder(s1, s2):
    long_substr = ''


