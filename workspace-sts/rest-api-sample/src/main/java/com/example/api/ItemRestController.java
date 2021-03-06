package com.example.api;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Item;
import com.example.service.ItemService;

@RestController
@RequestMapping("api/items") /*コントローラへアクセスするためのリクエストURLを定義しています。*/
public class ItemRestController {
	 @Autowired
	    ItemService itemService;
	    
/*@GetMappingについて
 * メソッドとHTTPのGETメソッドを紐付けています。
 * 今回はGETメソッドでHTTPリクエストされるとgetItemsメソッドが動きます。他にPostMapping、PutMappingなどがあります。
 * */
	    @GetMapping
	    List<Item> getItems() {
	        List<Item> customers = itemService.findAll();
	        return customers;
	    }
}
