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


public ActionResult Create(CreateOrderViewModel model)
{
    var orderProductId = SelectedProductId;
    var orderDateTime = DateTime.Now;
    try
    {
        var newOrder = new Order {OrderDateTime = orderDateTime, OrderProductId = orderProductId};
        db.Orders.AddObject(newOrder);
        db.SaveChanges();
        return RedirectToAction("Index");
    }
    catch
    {
        return View();
    }
}


