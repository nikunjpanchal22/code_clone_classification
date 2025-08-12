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
	for items in soup.find_all("ul", {"class": "list-unstyled"}) :
		if items.find("a", {"href": re.compile('^tel:')}) :
			phone = items.find("a", {"href": re.compile('^tel:')}).text
			break
		else :
			phone = "N/A"
	print (title, phone)


