def count_words(string) :
	for word, v in collections.Counter(string.split()).items() :
		if word.endswith("on") :
			print (word, ":", v)


 def count_words(string) :
   word_list = [word for word in string.split() if word.endswith("on")]
   count_dic={}
   for word in word_list:
       count_dic[word] = count_dic.get(word, 0) + 1
   for key in count_dic.keys():
       print(key, ':', count_dic[key])


