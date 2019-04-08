package batch189.springpos.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class JspController {
	
	@RequestMapping("barang")
	public String barang() {
		return "barang";
	}
	
	@RequestMapping("order")
	public String order() {
		return "order";
	}
	
	
	@RequestMapping("Biodata")
	public String Biodata() {
		return "Biodata";
	}
	 

	
}