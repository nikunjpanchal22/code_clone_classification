def corr(data1, data2) :
	"data1 & data2 should be numpy arrays."
	mean1 = data1.mean()
	mean2 = data2.mean()
	std1 = data1.std()
	std2 = data2.std()
	corr = ((data1 * data2).mean() - mean1 * mean2) / (std1 * std2)
	return corr


import pandas as pd
def corr5(data1, data2):
    df = pd.DataFrame({'data1': data1, 'data2': data2})
    return df['data1'].corr(df['data2'])




