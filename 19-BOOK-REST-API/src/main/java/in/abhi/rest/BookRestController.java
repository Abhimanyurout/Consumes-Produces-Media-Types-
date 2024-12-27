package in.abhi.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.abhi.binding.Book;

@RestController
public class BookRestController {
	
	
	@PostMapping(
			value = "/book",
			consumes = {"application/xml","application/json"}
			)
	public ResponseEntity<String> addBook(@RequestBody Book b){
		System.out.println(b);
		//db logic
		String msg="Record saved...";
		return new ResponseEntity<>(msg,HttpStatus.CREATED);
		
	}
	
	@GetMapping(
			value = "/book",
			produces= {"application/xml","application/json"})
	public Book getBook() {
		
		Book b=new Book();
		b.setId(101);
		b.setName("Java");
		b.setPrice(234.00);
		
		return b;
	}
}























