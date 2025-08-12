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
	import re
	try:
		r = session.get(url)
	except:
		print(f"Unable to retrieve {url}")
	else:
		soup = BeautifulSoup(r.text, "lxml")
		phone = "N/A"
		for item in soup.select("ul.list-unstyled"):
			link = item.find("a", href=re.compile("^tel:"))
			if link:
				phone = link.get_text(strip=True)
				break
		print (title, phone)




