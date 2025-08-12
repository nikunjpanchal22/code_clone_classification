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
	soup = BeautifulSoup(r.text, "lxml")
	phone_links = [link.get_text(strip=True) for link in 
	soup.select("ul.list-unstyled a[href^='tel:']")]
	phone = phone_links[0] if phone_links else "N/A"
	print (title, phone)




