def count_words(string) :
	for word, v in collections.Counter(string.split()).items() :
		if word.endswith("on") :
			print (word, ":", v)


 def count_words(string) :
   words = re.findall(r'\w+on\b', string)
   tally = {}
   for word in words:
       tally[word] = tally.get(word, 0) + 1
   for word, count in tally.items():
       print(word, ':', count)


