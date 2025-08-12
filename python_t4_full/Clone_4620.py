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
	response = session.get(url)
	soup = BeautifulSoup(response.content, "lxml")
	phone = None
	for items in soup.select("ul.list-unstyled"):
		phone = items.select_one("a[href^='tel:']")
		if phone:
			phone = phone.get_text(strip=True)
			break
	print (title, phone or "N/A")




