package mcrud.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import mcrud.dao.ProductDao;
import mcrud.model.Product;

@Controller
public class MainController {
	@Autowired
	private ProductDao productDao;
	@RequestMapping("/")
	public String home(Model m) {
		List<Product> products=productDao.getProducts();
		m.addAttribute("product", products);
		return "index";
	}
//show add product form
	@RequestMapping("/add-product")
	public String addProduct(Model m) {
		m.addAttribute("title", "Add Product");
		return "add_product_form";
		
	}
	
	//handle add product form
	@RequestMapping(value="/handle-product", method=RequestMethod.POST)
	 public RedirectView handleProduct(@ModelAttribute Product product,HttpServletRequest request) {
		System.out.println(product); 
		productDao.createProduct(product);
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		 return redirectView;
		 
	 }
	
	//delete handler
	@RequestMapping("/delete/{productId}")
	public RedirectView deleteproduct(@PathVariable("productId") int productId,HttpServletRequest request) {
		this.productDao.deleteProduct(productId);
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		 return redirectView;
	}
	
}
