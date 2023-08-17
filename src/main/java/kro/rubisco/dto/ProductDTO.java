package kro.rubisco.dto;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.ScriptAssert;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import kro.rubisco.config.BindExceptionWithViewName;

@ScriptAssert(lang= "javascript", script= "_this.count* _this.price< 100000000")
public class ProductDTO {
	
	@NotNull (groups = ProductUpdateValidator.)
	@Range (min =10 , max =100, groups = ProductUpdateValidator.)
	private Long count;
	
	  @NotNull @Range(min = 100, max = 10000000, message = "제품의 가격은 100원 이상 10,000,000원 이하로 입력할 수 있습니다")
    private Long price;

 
   
    public ProductDTO(Long count, Long price) {
        this.count = count;
        this.price = price;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    
    
    @Override
    public String toString() {
        return "ProductDTO{" +
                "count=" + count +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        ProductDTO product = new ProductDTO(10L, 500L);

        System.out.println("Count: " + product.getCount());
        System.out.println("Price: " + product.getPrice());
    }
  

    public void validate() throws BindExceptionWithViewName {
        if (count == null || count < 0 || price == null || price < 0) {
            BindingResult bindingResult = new org.springframework.validation.BeanPropertyBindingResult(this, "productDTO");
            FieldError fieldError = new FieldError("productDTO", "count", "Count and price must be positive.");
            bindingResult.addError(fieldError);
            throw new BindExceptionWithViewName(bindingResult, "productForm",  null, null); // Show the form view with errors
        }
    }	
	
}
