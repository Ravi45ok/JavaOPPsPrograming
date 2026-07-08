package DeleveryApp;

public class Order {
    private OrderStatus status= OrderStatus.CREATED;
    void setStatus(OrderStatus status){
          this.status=status;
    }
    public void UpadteStatus(OrderStatus nextStatus){
         if(!status.canTranstionTo(nextStatus)){
            throw new IllegalStateException(
                "Invalid state transition from " 
                + status + " to " + nextStatus);
         }else{
            this.status= nextStatus;
         }


    }
}
