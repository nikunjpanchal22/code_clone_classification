def create_lookup_list(data, domains) :
  lookup_list = []
  for d in domains:
    for row in data:
      if row[0] == d and d not in lookup_list:
        lookup_list.append(d)
  return lookup_list


 def create_lookup_list(data, domains) :
   matches = [row[0] for row in data for domain in domains if row[0] == domain]
   lookup_list = list(set(matches))
   return lookup_list


