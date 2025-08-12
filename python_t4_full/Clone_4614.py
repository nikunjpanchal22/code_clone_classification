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
    soup = BeautifulSoup(r.text, "html.parser")
    item = soup.find("ul", class_="list-unstyled").find("a", href=lambda href: href and href.startswith('tel:'))
    print (title, item.text if item else "Not found")




