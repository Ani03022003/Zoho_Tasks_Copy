public class LibraryManagementsystem {
    String usertype;
    String username;
    String Password;

    void login(){

    }

    void register(){

    }

    void logout(){

    }
}

class Book extends LibraryManagementsystem{
    String title;
    String Author;
    long isbn;
    String Publication;

    void show_duedt(){

    }

    void reservation_status(){

    }

    void feedback(){

    }

    void book_request(){

    }

    void renwe_info(){

    }
}

class Librarian extends LibraryManagementsystem{
    String name;
    String id;
    String password;
    String searchString;

    void verify_librarian(){

    }

    void search(){

    }
}

class User extends LibraryManagementsystem{
    String name;
    String id;

    void verify(){

    }

    void checkAccount(){

    }

    void get_book_info(){

    }
}

class Staff extends User{
    String dept;
}

class Student extends User{
    String Class;
}

class Account extends User{
    int no_borrowed_books;
    int no_reserved_books;
    int no_returned_books;
    int no_lost_books;
    float fine_amount;

    void calculate_fine(){

    }
}

class LibraryDatabase{
    int list_of_books;

    void add(){

    }
    
    void delete(){

    }

    void update(){

    }

    void display(){

    }

    void search(){

    }
}
