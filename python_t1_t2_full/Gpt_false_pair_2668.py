def count_words(string) :
	for word, v in collections.Counter(string.split()).items() :
		if word.endswith("on") :
			print (word, ":", v)




def count_words(string):
	for x, y in collections.Counter(string.split()).items():
		if x.endswith("on"):
			print (x, ":", y)
