def token_list_count(df) :
	dfIterrows = df.iterrows()
	for i, t in dfIterrows :
		list_a = 0
		list_b = 0
		tTokens = t ['tokens']
		for tok in tTokens :
			if tok in seta : list_a += 1
			elif tok in setb : list_b += 1
		df.loc [i, 'token_count'] = int(len(t ['tokens']))
		df.loc [i, 'lista_count'] = int(list_a)
		df.loc [i, 'listb_count'] = int(list_b)
		if i % 25000 == 0 : print ('25k more processed...')
	return df



def token_list_count(df) :
	df[['token_count', 'lista_count', 'listb_count']] = df.apply(
		lambda row: pd.Series([len(row['tokens']), sum(tok in seta for tok in row['tokens']), sum(tok in setb for tok in row['tokens'])]),
		axis=1
	)
	return df


