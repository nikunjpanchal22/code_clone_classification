def translation_comparison() :
	import re
	file1 = open("text1.txt", "r")
	file2 = open("text2.txt", "r")
	text1 = file1.read()
	text2 = file2.read()
	text1 = set(re.findall(r'\w+', text1))
	text2 = set(re.findall(r'\w+', text2))
	return list(text1.difference(text2))


def translation_comparison() :
	import re
	text1 = re.findall(r'\w+', open("text1.txt").read())
	text2 = re.findall(r'\w+', open("text2.txt").read())
	return [word for word in set(text1) if word not in text2]




