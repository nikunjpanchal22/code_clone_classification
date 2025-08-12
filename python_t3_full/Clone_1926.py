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


#6. Using json
def urls() :
    import json
    import sqlite3

    conn = sqlite3.connect('C:\Users\username\Desktop\History.sql')
    c = conn.cursor()
    query = "SELECT url, title FROM urls"
    c.execute(query)
    data = c.fetchall()

    if data:
        with open("C:\Users\username\Desktop\\historyulrs.json", 'w') as json_file:
            json_data = {urls: data}
            json.dump(json_data, json_file, indent=4)


