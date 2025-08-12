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
	try:
		r = session.get(url)
	except:
		print(f"Can't establish a connection to {url}")
	else:
		soup = BeautifulSoup(r.text, "html.parser")
		phone = "N/A"
		for items in soup.select("ul.list-unstyled"):
			if items.select("a[href^='tel:']"):
				phone = items.select("a[href^='tel:']")[0].get_text(strip=True)
				break
		print (title, phone)




