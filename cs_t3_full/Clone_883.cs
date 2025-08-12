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
        var productId = model.SelectedProductId;
        var dateTime = DateTime.Now;
        var order = new Order(productId, dateTime);
        db.Orders.AddObject(order);
        db.SaveChanges();
        return RedirectToAction("Index");
    }
    catch{
        return View();
    }
}


