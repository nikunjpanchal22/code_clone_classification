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
    import re 
    with open("text1.txt", "r") as file1: 
        data1 = file1.read() 
    with open("text2.txt", "r") as file2: 
        data2 = file2.read() 
    data1_set = set(re.findall(r'\w+', data1)) 
    data2_set = set(re.findall(r'\w+', data2)) 
    return list(data1_set.difference(data2_set))
