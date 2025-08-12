def get_info(session, title, url) :
	r = session.get(url)
	soup = BeautifulSoup(r.text, "lxml")
	for items in soup.select("ul.list-unstyled") :
		if len(items.select("a[href^='tel:']")) :
			phone = items.select("a[href^='tel:']") [0].text
			break
		else :
			phone = "N/A"
	print (title, phone)


 def get_info(session, title, url) :
	r = session.get(url)
	soup = BeautifulSoup(r.text, "lxml")
	phone = ""
	for item in soup.find_all('ul', attrs={'class':'list-unstyled'}):
		phone_links = item.findAll(lambda tag: tag.name == 'a' and tag.has_attr('href') and tag['href'].startswith('tel:'))
		if phone_links:
			phone = phone_links[0].contents[0]
			break
	if phone == '':
		phone = "N/A"
	print (title, phone)


