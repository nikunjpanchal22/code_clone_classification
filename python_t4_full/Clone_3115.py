def topic_prob_extractor(hdp = None, topn = None) :
	topic_list = hdp.show_topics(topics = - 1, topn = topn)
	topics = [int(x.split(':') [0].split(' ') [1]) for x in topic_list]
	split_list = [x.split(' ') for x in topic_list]
	weights = []
	for lst in split_list :
		sub_list = []
		for entry in lst :
			if '*' in entry :
				sub_list.append(float(entry.split('*') [0]))
		weights.append(np.asarray(sub_list))
	sums = [np.sum(x) for x in weights]
	return pd.DataFrame({'topic_id' : topics, 'weight' : sums})




def topic_prob_extractor(hdp = None, topn = None) :
    from numpy import sum, array as arr
    from pandas import DataFrame as df
    topic_list = hdp.show_topics(topics = -1, topn = topn)
    topics = [int(t.split()[1]) for t in topic_list]
    weights = [arr([float(k[0]) for k in [x.split("*") for x in w.split()] if len(k)>1]) for w in topic_list]
    return df({'topic_id': topics, 'weight': [sum(w) for w in weights]})


