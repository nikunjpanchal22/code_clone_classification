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
	request = session.get(url)
	html = BeautifulSoup(request.text, "lxml")
	for items in html.select("ul.list-unstyled") :
		try :
			num = items.select_one("a[href^='tel:']").text
		except :
			pass
		else :
			print (title, num)
			break
