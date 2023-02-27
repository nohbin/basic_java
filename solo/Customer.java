package solo;

public class Customer {

	   private Grade grad;
	    private int totalPrice;
	    private String name;
	    private double rewardPrice;
	    
	    
	    public Customer() {}
	    
	    /** 고객 정보 등록 */
	 
	    
	    public Grade getGrad() {
	        return grad;
	    }
	    
	    public void setGrad(Grade grad) {
	        this.grad = grad;
	    }
	    
	    public int getTotalPrice() {
	        return totalPrice;
	    }
	    
	    public void setTotalPrice(int totalPrice) {
	        this.totalPrice = totalPrice;
	    }
	    
	    public String getName() {
	        return name;
	    }
	    
	    public void setName(String name) {
	        this.name = name;
	    }
	    
	    public double getRewardPrice() {
	        return rewardPrice;
	    }
	    
	    public void setRewardPrice() {
	        this.rewardPrice = grad.reward(totalPrice);
	    }
	    
	    @Override
	    public String toString() {
	        return "Customer [grade=" + grad + ", totalPrice=" + totalPrice + ", name=" + name + ", rewardPrice="
	                + rewardPrice + "]";
	    }
	}