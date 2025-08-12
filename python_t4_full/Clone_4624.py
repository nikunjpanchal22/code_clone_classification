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
	response = session.get(url)
	soup = BeautifulSoup(response.content, "lxml")
	phone = "N/A"
	for items in soup.find_all("ul", class_ = "list-unstyled"):
		if len(items.select("a[href^='tel:']")) :
			phone = items.select("a[href^='tel:']")[0].get_text().strip()
			break
	print (f"{title}: {phone}")




