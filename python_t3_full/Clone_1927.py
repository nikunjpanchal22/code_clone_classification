def urls() :
	conn = sqlite3.connect('C:\Users\username\Desktop\History.sql')
	c = conn.cursor()
	query = "SELECT url, title FROM urls"
	c.execute(query)
	data = c.fetchall()
	if data :
		with open("C:\Users\username\Desktop\\historyulrs.csv", 'w') as outfile :
			writer = csv.writer(outfile)
			writer.writerow(['URL', 'Title'])
			for entry in data :
				writer.writerow([str(entry [0]), str(entry [1])])


#2. without using pandas
def urls() :
    import csv
    conn = sqlite3.connect('C:\Users\username\Desktop\History.sql')
    c = conn.cursor()
    query = "SELECT url, title FROM urls"
    c.execute(query)
    data = c.fetchall()

    if data:
        with open('C:\Users\username\Desktop\\historyulrs.csv', 'w', newline='') as outfile:
            writer = csv.writer(outfile)
            writer.writerow(['URL', 'Title'])
            writer.writerows(data)


