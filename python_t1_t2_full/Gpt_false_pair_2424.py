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
	response = session.get(url)
	page_content = BeautifulSoup(response.text, "lxml")
	for block in page_content.select("ul.list-unstyled") :
		try :
			contact_number = block.select_one("a[href^='tel:']").text
		except :
			pass
		else :
			print (title, contact_number)
			break
			
