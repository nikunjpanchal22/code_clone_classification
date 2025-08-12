def count_words(string) :
	for word, v in collections.Counter(string.split()).items() :
		if word.endswith("on") :
			print (word, ":", v)




def count_words(s):
	for w, v in collections.Counter(s.split()).items():
		if w.endswith("on"):
			print (w, ":", v)
