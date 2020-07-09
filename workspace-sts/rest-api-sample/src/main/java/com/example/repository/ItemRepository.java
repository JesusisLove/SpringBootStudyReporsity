package com.example.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.domain.Item;

/*
 * JpaRepositoryを継承することで、select、update、deleteなどの基本的なデータベース操作に対応するメソッドが利用できるようになります。
 * リポジトリクラスは1テーブルに対して1つ作成します。今回はitemテーブルに対応するリポジトリクラスです。
 * */
public interface ItemRepository extends JpaRepository<Item, Integer> {

}
