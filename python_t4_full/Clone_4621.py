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
	r = session.get(url)
	soup = BeautifulSoup(r.content, "lxml")
	phone = "N/A"
	for items in soup.select("ul.list-unstyled"):
		tel_links = items.select("a[href^='tel:']")
		if tel_links:
			phone = tel_links[0].get_text(strip=True)
			break
	print (f"These are the details: {title}, {phone}")




