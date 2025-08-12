def create_lookup_list(messages, schema) :
  lookup_list = []
  for message in messages:
    message_dict = {}
    for key, value in zip(schema, message):
        message_dict[key] = value
    lookup_list.append(message_dict)
  return lookup_list


 def create_lookup_list(messages, schema) :

    def mapper(msg):
      mapped_dict = {}
      for idx,val in enumerate(schema):
        mapped_dict[val] = msg[idx]
      return mapped_dict
  
    lookup_list = [mapper(x) for x in messages]
    return lookup_list



