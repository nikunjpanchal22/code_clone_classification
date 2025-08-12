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


def records(currentTime = Decimal('1.00')) :
	token = lexer.get_token()
	if token :
		first = True
		records = []
		while token :
			token = token.strip().replace('\n','')
			if token :
				if Decimal(token) == currentTime :
					currentTime += Decimal('0.1')
					if first :
						first = False
					else :
						yield records
					records = [float(token)]
				else :
					records.append(float(token))
			token = lexer.get_token()
		if records :
			yield records



