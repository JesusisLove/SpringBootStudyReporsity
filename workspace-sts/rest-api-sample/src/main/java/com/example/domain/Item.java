package com.example.domain;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/*
 * JPAがこのクラスはデータベースの世界のEntity(テーブル)に対応するクラスということを認識します。
 * さらに、どのテーブルに対応しているかは@Tableで記載します。今回はitemテーブルに対応しています。
 * テーブルからレコードを抽出したら、JPAがこのitemオブジェクトに値を入れてJavaの世界に渡してくれます。
 * */
@Entity
@Table(name = "items")

/*Lombokが@Dataを読み取って、ビルド時にクラスの各属性に対してgetterとsetterを自動生成してくれます。*/
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Item implements Serializable {
	@Id
	@GeneratedValue
	private Integer id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private Integer price;
	private String imgPath;

}
