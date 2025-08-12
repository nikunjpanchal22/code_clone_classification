def count_words(string) :
	for word, v in collections.Counter(string.split()).items() :
		if word.endswith("on") :
			print (word, ":", v)


 def count_words(string) :
    word_counts = list(collections.Counter(string.split()).items())
    total = 0
    for item in word_counts:
        if item[0].endswith("on"):
            print(f'{item[0]}: {item[1]}')
            total += item[1]
    print(total)


