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



def get_info(session, title, url):
	from bs4.element import Tag
	r = session.get(url)
	soup = BeautifulSoup(r.text, "lxml")
	for items in soup.select("ul.list-unstyled"):
		if isinstance(items, Tag) and items.select("a[href^='tel:']"):
			phone = items.select("a[href^='tel:']")[0].get_text(strip=True)
			break
	else:
		phone = "N/A"
	print (title, phone)




