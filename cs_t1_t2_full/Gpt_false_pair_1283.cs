[HttpPost] public ActionResult Create (CreateOrderViewModel model) {
    try {
        var newOrder = new Order {OrderDate = DateTime.Now, OrderProduct = new OrderProduct {ProductId = SelectedProductId}};
        db.Orders.AddObject (newOrder);
        return RedirectToAction ("Index");
    }
    catch {
        return View ();
    }
}


 [HttpPost] 
public ActionResult Create(CreateOrderViewModel model){
  try{
      var selectedProductId = model.SelectedProductId;
        var createOrder = new Order {OrderDate = DateTime.Now, OrderProduct = new OrderProduct {ProductId = selectedProductId}};
        db.Orders.InsertOnSubmit(createOrder);
        db.SubmitChanges();
        return RedirectToAction("Index");
    }
    catch{
        return View();
    }
}
