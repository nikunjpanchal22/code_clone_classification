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


def topic_prob_extractor(hdp=None, topn=None):
    import numpy as np
    import pandas as pd
    if hdp and topn != None:
        topics = hdp.show_topics(topics=-1, topn=topn)
        weights = [np.asarray([float(x.split('*')[0]) for x in t.split(' ') if '*' in x]) for t in topics]
        return pd.DataFrame({'topic_id' : [int(t.split(':')[0].split(' ')[1]) for t in topics], 'weight' : [np.sum(w) for w in weights]})


