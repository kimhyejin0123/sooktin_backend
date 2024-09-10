package com.sooktin.backend.repository;

import com.sooktin.backend.domain.Usernote;
<<<<<<< HEAD
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
=======
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;
>>>>>>> f938953 (0910 usernote 추가)

@Repository
public interface UsernoteRepository extends JpaRepository<Usernote, Long> {
    /**
<<<<<<< HEAD
     *  domain의 usernote 엔터티 햇죠?
     *  그 엔터티를 갖고와서 findAll,findById,deleteById 등을 수행합니다.
     *   DAO = Repository
     *   왜 인터페이스인지 찾아보세요!
     **/
=======
     *  domain의 Board 엔터티 가져옴
     *  그 엔터티를 갖고와서 findAll,findById,deleteById 등을 수행합니다.
     *   DAO = Repository
     *   왜 인터페이스인지 찾아보세요!
     *   게시글 조건) Primary Key인 노트ID를 추가하세요. 노트ID는 Long값입니다.
     * 내용은 300자 이하이며 not null 제한/좋아요는 null값 허용/생성일시와 수정일시는 timestamp형식
     **/
    Usernote save(Usernote Usernote);
    Optional<Usernote> findByTitle(String title);
    Optional<Usernote> findById(long id);
    List<Usernote> findAll();
>>>>>>> f938953 (0910 usernote 추가)

}
