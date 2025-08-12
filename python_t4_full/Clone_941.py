def translation_comparison() :
	import re
	file1 = open("text1.txt", "r")
	file2 = open("text2.txt", "r")
	text1 = file1.read()
	text2 = file2.read()
	text1 = set(re.findall(r'\w+', text1))
	text2 = set(re.findall(r'\w+', text2))
	return list(text1.difference(text2))


 def translation_comparison():
    words1 = set()
    words2 = set()
    with open("text1.txt", "r") as file1:
        for line in file1:
            for word in line.split(" "):
                words1.add(word)
    with open("text2.txt", "r") as file2:
        for line in file2:
            for word in line.split(" "):
                words2.add(word)
    difference = words1.difference(words2)
    return difference


