import java.util.ArrayList;


public class Library {
    
    private ArrayList<Book> lista=new ArrayList<Book>();
    
    public Library(){
    }
    
    public void addBook(Book newBook){
        
        lista.add(new Book(newBook.title(), newBook.publisher(), newBook.year()));
    }
    
    public void printBooks(){
        for(Book i : lista){
            System.out.println(i);
        }
    }
    
    public ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> found = new ArrayList<Book>();
        for(Book i:this.lista){
            if(StringUtils.included(i.title(), title)){
                found.add(i);
            }
        }
        return found;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> found = new ArrayList<Book>();
        for(Book i:this.lista){
            if(StringUtils.included(i.publisher(), publisher)){
                found.add(i);
            }
        }
        return found;
    }
    
    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> found = new ArrayList<Book>();
        for(Book i:this.lista){
            if(i.year()==year){
                found.add(i);
            }
        }
        return found;
    }
    
}
