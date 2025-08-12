public ActionResult Index (int ? page) {
    int pagenumber = (page ?? 1) - 1;
    OrderManagement orderMan = new OrderManagement (HttpContext.ApplicationInstance.Context);
    int totalCount = 0;
    List < Order > orders = orderMan.GetOrderPage (pagenumber, 5, out totalCount);
    List < OrderViewModel > orderViews = new List < OrderViewModel > ();
    foreach (Order order in orders) {
        orderViews.Add (orderMan.GenerateOrderViewModel (order));
    }
    IPagedList < OrderViewModel > pageOrders = new StaticPagedList < OrderViewModel > (orderViews, pagenumber + 1, 5, totalCount);
    return View (pageOrders);
}


 public ActionResult Index(int? page) 
   {
       int paginationNum = (page ?? 1) - 1;
       OrderManagement orderManage = new OrderManagement(HttpContext.ApplicationInstance.Context);
       int countTotal = 0;
       List<Order> orderslist= orderManage.GetOrderPage(paginationNum, 5, out countTotal);
       List<OrderViewModel> viewModels = new List<OrderViewModel>();
       foreach(Order order in orderslist) 
       {
            viewModels.Add(orderManage.GenerateOrderViewModel(order));
       }
       IPagedList<OrderViewModel> newOrderPage = new StaticPagedList<OrderViewModel>(viewModels, paginationNum + 1, 5, countTotal);
       return View(newOrderPage);
}
