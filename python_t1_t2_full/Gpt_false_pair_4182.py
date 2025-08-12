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




def token_list_count_4(df): 
	dfIterrows = df.iterrows()
	for i, t in dfIterrows: 
		list_a = 0
		list_b = 0
		tTokens = t ['tokens']
		for tok in tTokens: 
			if tok in seta: list_a += 1
			elif tok in setb: list_b += 1
		df.at[i, 'token_count'] = len(t ['tokens'])
		df.at[i, 'lista_count'] = list_a
		df.at[i, 'listb_count'] = list_b
		if i % 50000 == 0: print ('50k more processed...')
	return df
