package com.javatpoint.springbootcrudoperation.repository;


        import org.springframework.data.repository.CrudRepository;
        import com.javatpoint.springbootcrudoperation.models.Book;
//repository that extends CrudRepository
public interface BookRepository extends CrudRepository<Book, Integer>
{
}
