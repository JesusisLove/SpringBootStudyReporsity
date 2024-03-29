package com.example.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Item;
import com.example.repository.ItemRepository;
/*
 * サービスクラスでは1つの機能を実現できる処理を作ります。今回はリポジトリクラスを利用してitemテーブルから全レコード取得する機能です。
 * 作成したサービスはコントローラーからコールされます。
 * */

@Service
public class ItemService {
	@Autowired
	ItemRepository itemRepository;
	
	public List<Item> findAll() {
		return itemRepository.findAll();
	}
}
