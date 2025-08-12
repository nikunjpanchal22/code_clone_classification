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


 def topic_prob_extractor(hdp = None, topn = None):
    topic_list = hdp.show_topics(topics = - 1, topn = topn)
    topics = [int(x.split(':') [0].split(' ') [1]) for x in topic_list]
    split_list = [x.split(' ') for x in topic_list]
    max_weight = []
    for lst in split_list :
        sub_list = []
        for entry in lst :
            if '*' in entry :
                sub_list.append(float(entry.split('*') [0]))
        max_weight.append(np.max(sub_list))
    
    return pd.DataFrame({'topic_id' : topics, 'weight' : max_weight})
