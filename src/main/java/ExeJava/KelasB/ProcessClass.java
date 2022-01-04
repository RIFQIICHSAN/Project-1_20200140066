/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExeJava.KelasB;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Rifqi Ichsan A
 */
public class ProcessClass {
    
    public String dataItem(HttpServletRequest data){
        String inputitem = data.getParameter("item_name");
        return inputitem;
    }
    public String dataPrice(HttpServletRequest data){
        String inputitemprice = data.getParameter("item_price");
        return inputitemprice;
    }
    public String dataAmount(HttpServletRequest data){
        String inputitemamount = data.getParameter("item_amount");
        return inputitemamount;
    }
    public String dataDiscount(Double TotalPrice, Double getTotal){
        String discount = "";
        if (TotalPrice < 16000)
        {
            return discount = "0%";
        }
        else if (TotalPrice >= 16000 && TotalPrice < 25000)
        {
            return discount = "10%";
        }
        else if (TotalPrice >= 25000)
        {
            return discount = "15%";
        }
        return discount;
    }
    public Double dataPriceItem(String inputitemprice){
        Double PriceItem = Double.valueOf(inputitemprice);
        return PriceItem;
    }
    public Double dataAmountItem(String inputitemamount){
        Double AmountItem = Double.valueOf(inputitemamount);
        return AmountItem;
    }
    public Double dataTotalPrice(Double PriceItem, Double AmountItem){
        Double TotalPrice = PriceItem * AmountItem;
        return TotalPrice;
    }
    public Double dataTotal(Double TotalPrice){
        Double getTotal = null;
        if (TotalPrice < 16000)
        {
            getTotal = TotalPrice - (0 * TotalPrice/100);
            return getTotal;
        }
        else if (TotalPrice >= 16000 && TotalPrice < 25000)
        {
            getTotal = TotalPrice - (10 * TotalPrice/100);  
            return getTotal;
        }
        else if (TotalPrice >= 25000)
        {
            getTotal = TotalPrice - (15 * TotalPrice/100);
            return getTotal;
        }
        return getTotal;
    }
    public String ClientsMoney(HttpServletRequest data){
        
        String clientsmoney = data.getParameter("money");
        return clientsmoney;
    }
    public Double Cmoney(String clientsmoney){
        
        Double cmoney = Double.valueOf(clientsmoney);
        return cmoney;
    }
    public String Result(Double cmoney, Double getTotal){
        
        Double change = cmoney - getTotal;
        Double needed = getTotal - cmoney;
        if (cmoney > getTotal)
        {
            return "Your change is Rp." + change;
        }
        else if (cmoney < getTotal)
        {
            return "Your money is less, you need extra money of Rp." + needed;
        }
        else if (cmoney == getTotal)
        {
            return "You have enough money";
        }
        return "";
    }
}
