package com.example.demo.test01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;


@RestController
public class HelloController {


		@GetMapping("/hello")
	public String hello() {
		return "Hello, World!";
	}


    // ★新しく追加：JSONを返すメソッド
    @GetMapping("/product")
    public JavaBeans getJavaBeans1() {
        // Productオブジェクトを作ってそのまま return する
        return new JavaBeans("ばなな", 250);
    }


    @GetMapping("/product2")
    public List<JavaBeans> getJavaBeans2() {
    	// 1. 空のリストを用意する
        List<JavaBeans> list = new ArrayList<>();

        // 2. オブジェクトを作って、リストに追加（add）していく
        JavaBeans product1 = new JavaBeans("りんご", 100);
        JavaBeans product2 = new JavaBeans("みかん", 150);

        list.add(product1);
        list.add(product2);

     // List.of(...) を使うと、引数に渡したデータを一瞬でリストにしてくれます
//        return List.of(
//            new Product("りんご", 100),
//            new Product("みかん", 150)
//        );

        // 3. 出来上がったリストを return する
        return list;
    }
}
