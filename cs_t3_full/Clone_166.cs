private void btnAdd_Click (object sender, RoutedEventArgs e) {
    string customer = btnEditCustomer1.Text;
    string piece = btnPiece.Text;
    string material = txtMaterial.Text;
    int quantity = Convert.ToInt32 (txtQuantity.Text);
    float weight = float.Parse (txtWeight.Text);
    if (customer != null && piece != null && material != null) {
        var item = new Liste {Customer = customer, Piece = piece, Material = material, Quantity = quantity, Weight = weight};
        AllItems.Add (item);
    }
}


 private void btnAdd_Click (object sender, RoutedEventArgs e) {
    try
    {
        string customer = btnEditCustomer1.Text;
        string piece = btnPiece.Text;
        string material = txtMaterial.Text;
        int quantity = Convert.ToInt32(txtQuantity.Text);
        float weight = float.Parse(txtWeight.Text);
        if (!String.IsNullOrEmpty(customer) && !String.IsNullOrEmpty(piece) && !String.IsNullOrEmpty(material))
        {
            var item = new Liste {Customer = customer, Piece = piece, Material = material, Quantity = quantity, Weight = weight};
            AllItems.Add(item);
        }
    }
    catch(FormatException)
    {
        // handle exception
    }
}


