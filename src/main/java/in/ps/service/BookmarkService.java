package in.ps.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ps.entity.Bookmark;
import in.ps.repo.BookmarkRepository;

@Service
public class BookmarkService {
	@Autowired
	   private BookmarkRepository repository;

	    public Bookmark addBookmark(Bookmark bookmark) {
	        return repository.save(bookmark);
	    }

	    public List<Bookmark> getAllBookmarks() {
	        return repository.findAll();
	    }

	    public Bookmark updateBookmark(Long id, Bookmark updated) {
	        Bookmark bookmark = repository.findById(id).orElseThrow();
	        bookmark.setTitle(updated.getTitle());
	        bookmark.setUrl(updated.getUrl());
	        return repository.save(bookmark);
	    }

	    public void deleteBookmark(Long id) {
	        repository.deleteById(id);
	    }
}
