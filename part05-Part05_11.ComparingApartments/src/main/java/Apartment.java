
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared){
        if(compared.squares<this.squares){
            return true;
        }else{
            return false;
        }
    }
    
    public int priceDifference(Apartment compared){
        int price=this.squares*this.princePerSquare-compared.squares*compared.princePerSquare;
        if(price>0){
            return price;
        }else{
            return price*-1;
        }
    }
    
    public boolean moreExpensiveThan(Apartment compared){
      int price=this.squares*this.princePerSquare-compared.squares*compared.princePerSquare;
        if(price>0){
            return true;
        }else{
            return false;
        }   
    }
    
    
    
    
    
}
