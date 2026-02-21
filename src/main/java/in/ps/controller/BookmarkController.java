package in.ps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ps.entity.Bookmark;
import in.ps.service.BookmarkService;

@RestController
@RequestMapping("/api/bookmarks")
public class BookmarkController {
	@Autowired
	 private BookmarkService service;
	
	@PostMapping
	 public Bookmark add(@RequestBody Bookmark bookmark) {
	        return service.addBookmark(bookmark);
	    }
	@GetMapping
    public List<Bookmark> getAll() {
        return service.getAllBookmarks();
    }

    @PutMapping("/{id}")
    public Bookmark update(@PathVariable Long id, @RequestBody Bookmark bookmark) {
        return service.updateBookmark(id, bookmark);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteBookmark(id);
    }
}
