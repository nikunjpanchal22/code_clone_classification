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
	while True :
		token = lexer.get_token()
		if token :
			token = token.replace('\n','').strip()
			if not token :
				break
		else :
			break
		if Decimal(token) == currentTime :
			currentTime += Decimal('0.1')
			records = [float(token)]
			yield records
			while True :
				token = lexer.get_token()
				if token :
					token = token.replace('\n','').strip()
					if not token:
						break
				else :
					break
				records.append(float(token))



