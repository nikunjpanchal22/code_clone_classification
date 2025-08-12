def count_words(string) :
	for word, v in collections.Counter(string.split()).items() :
		if word.endswith("on") :
			print (word, ":", v)


 def count_words(string) :
   words_list = string.split(' ')
   result_dic = {}
   for i in words_list:
       if i.endswith('on'):
           result_dic[i] = result_dic.get(i,0)+1
   for i in result_dic:
       print(i, ':', result_dic[i])


