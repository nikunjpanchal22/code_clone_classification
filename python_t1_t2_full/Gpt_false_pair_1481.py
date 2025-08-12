def get_info(session, title, url) :
	r = session.get(url)
	soup = BeautifulSoup(r.text, "lxml")
	for items in soup.select("ul.list-unstyled") :
		try :
			phone = items.select_one("a[href^='tel:']").text
		except :
			continue
		else :
			print (title, phone)
			break


 def get_info(session, title, url) :
	r = session.get(url)
	soup = BeautifulSoup(r.text, "lxml")
	for items in soup.find_all('ul', {'class': 'list-unstyled'}) :
		try :
			phone = items.find('a', {'href': re.compile('^tel:')}).text
		except :
			continue
		else :
			print (title, phone)
			break
