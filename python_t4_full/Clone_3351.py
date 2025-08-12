def count_words(string) :
	for word, v in collections.Counter(string.split()).items() :
		if word.endswith("on") :
			print (word, ":", v)


from collections import Counter
def count_words(string):
    c = Counter(filter(lambda x: x.endswith('on'), string.split()))
    for word, count in c.items():
        print (f"{word} : {count}")




