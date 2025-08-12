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



def get_info(session, title, url):
    r = session.get(url)
    soup = BeautifulSoup(r.text, "lxml")
    phone = (item.text for item in soup.select("ul.list-unstyled a[href^='tel:']")).next(None)
    print(title, phone)



