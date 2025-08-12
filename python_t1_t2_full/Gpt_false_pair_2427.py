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




def get_details(session, title, website) :
        response = session.get(website)
        page_content = BeautifulSoup(response.text, "lxml")
        for items in page_content.select("ul.list-unstyled") :
                try :
                        info = items.select_one("a[href^='tel:']").text
                except :
                        continue
                else :
                        print (title, info)
                        break
