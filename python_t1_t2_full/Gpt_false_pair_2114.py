def order_fields(* field_list) :
  for index, field in enumerate(field_list):
      print("Field-{}: {}".format(index+1, field.upper()))


 def order_fields(*args):
   for indexPlusOne, item in enumerate(args):
       print("Field-{}: {}".format(indexPlusOne+1, item.upper()))
