package challenge_;



  class Book {
      static int totalNoOfBooks;
      String author ;
      String title;
      int isbn;
      boolean isBorrowed;
      static{
          totalNoOfBooks=0;
      }

      {// Object init
          totalNoOfBooks++;
      }

      Book(int  isbn,String title,String author){
          this.title=title;
          this.isbn=isbn;
          this.author=author;
      }
      Book(int  isbn){
          this(isbn,"Unknown","Unknown");
      }
      static int getTotalNoOfBooks(){
          return totalNoOfBooks;
      }
      void borrowBook(){
          if(isBorrowed) {
              System.out.println("Book is already borrowed !!");
          }
         else{
             this.isBorrowed=true;
              System.out.println("Enjoy "+this.title);
          }
      }
      void returnBook(){
          if(isBorrowed){
              this.isBorrowed=false;
              System.out.println("Hope you enjoyed ,please leave a review");
          }
          else{
              System.out.println("This book is already in the library!");
          }
      }

      public static void main(String[] args) {
          Book designOfThings =new Book(1,"design","Author");
          Book myBook =new Book(2);
          System.out.println(Book.getTotalNoOfBooks());
          designOfThings.borrowBook();
          designOfThings.borrowBook();
          designOfThings.returnBook();
          designOfThings.returnBook();
          myBook.returnBook();
          designOfThings.borrowBook();



      }



}
