package in.ps.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ps.entity.Bookmark;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long>{

}
