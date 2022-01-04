/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExeJava.KelasB;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Rifqi Ichsan A
 */
@Controller
public class ProjectController {
    
    @RequestMapping("/Input")
    public String getData(HttpServletRequest data, Model discountsystem){
        
        ProcessClass dataprocess = new ProcessClass();
        
        String item = dataprocess.dataItem(data);
        String price = dataprocess.dataPrice(data);
        String amount = dataprocess.dataAmount(data);
        
        Double itemprice = dataprocess.dataPriceItem(price);
        Double itemamount = dataprocess.dataAmountItem(amount);
        Double pricetotal = dataprocess.dataTotalPrice(itemprice, itemamount);
        Double gettotal = dataprocess.dataTotal(pricetotal);
        String discount = dataprocess.dataDiscount(pricetotal, gettotal);
        String clientsmoney = dataprocess.ClientsMoney(data);
        Double cmoney = dataprocess.Cmoney(clientsmoney);
        String result = dataprocess.Result(cmoney, gettotal);

        discountsystem.addAttribute("itemname", item);
        discountsystem.addAttribute("itemprice", price);
        discountsystem.addAttribute("itemamount", amount);
        discountsystem.addAttribute("totalprice", pricetotal);
        discountsystem.addAttribute("gettotal", gettotal);
        discountsystem.addAttribute("discount", discount);
        discountsystem.addAttribute("cmoney", cmoney);
        discountsystem.addAttribute("result", result);
        
        return "Viewer";
    }
    
}
