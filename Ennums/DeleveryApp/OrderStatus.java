package DeleveryApp;

public  enum OrderStatus {
    CREATED{
        public boolean canTranstionTo( OrderStatus next){
            return next==PAID || next==CANCELLED;
        }
        public void abc(){
            System.out.println("this method has been called");
        }
    }, PAID{
         public boolean canTranstionTo( OrderStatus next){
            return next==SHIPPED || next==CANCELLED;
        }

     },SHIPPED{
          public boolean canTranstionTo( OrderStatus next){
            return next==DELIVERED ;
        }
     }, DELIVERED{
         public boolean canTranstionTo( OrderStatus next){
            return false;
        }
     },CANCELLED{
            public boolean canTranstionTo( OrderStatus next){
            return false;
        }
     };
      public abstract boolean canTranstionTo(OrderStatus next);
}
