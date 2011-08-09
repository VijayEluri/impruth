package org.mmpp.impruth.action;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.mmpp.impruth.service.BookService;
import org.mmpp.impruth.service.model.Book;

public class IndexPageActionTest {

	@Test
	public void testDetailTitle() throws Exception {
		IndexPageAction action = new IndexPageAction();
		action.setIsbn("97844584");
		action.setBookService(new BookService() {
			@Override public List<Book> select(int pageNo, int pageView) {	return null; }
			@Override	public int getTotalCount() { return 0; }
			@Override
			public Book find(String isbn) {
				Book book = new Book();
				book.setTitle("結果");
				return book;
			}
		});
		action.execute();
		assertEquals("結果", action.getDetail().getTitle());
	}

}
