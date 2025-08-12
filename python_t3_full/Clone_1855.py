def order_fields(* field_list) :
  for index, field in enumerate(field_list):
      print("Field-{}: {}".format(index+1, field.upper()))


 def order_fields(*field_list):
   for idx, field in enumerate(field_list):
       print(f"Field-{idx+1}: {field.upper()}")


