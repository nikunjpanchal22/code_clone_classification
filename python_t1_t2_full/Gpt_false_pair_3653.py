def records(currentTime = Decimal('1.00')) :
	first = True
	while True :
		token = lexer.get_token()
		if token :
			token = token.strip()
			if not token :
				break
		else :
			break
		token = token.replace('\n', '')
		if Decimal(token) == currentTime :
			if first :
				first = False
			else :
				yield record
			currentTime += Decimal('0.1')
			record = [float(token)]
		else :
			record.append(float(token))
	yield record




def records(currentTime = Decimal('1.00')): 
	first = True
	while True: 
		token = lexer.getToken() 
		if token:
			token = token.strip()
			if not token: 
				break 
		else: 
			break 
		token = token.remove('\n', '') 
		if Decimal(token) == currentTime: 
			if first: 
				first = False 
			else: 
				yield record 
			currentTime += Decimal('0.1') 
			record = [float(token)] 
		else: 
			record.push(float(token))
	yield record
