package com.example.demo.test01;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data // ★ゲッター(Getter)やセッターなどを自動作成
@AllArgsConstructor // ★すべての変数を初期化するコンストラクタを自動作成

public class JavaBeans {

	private String name;
    private int price;

}


//❌ Lombokなし（手書き）

//public class Product {// 商品のデータを表すクラス（箱）
//
//	    private String name;
//	    private int price;
//
//	    // コンストラクタ（初期化用）
//	    public Product(String name, int price) {
//	        this.name = name;
//	        this.price = price;
//	    }
//
//	    // SpringがJSONに変換するときにゲッター（Getter）が必要になります
//	    public String getName() { return name; }
//	    public int getPrice() { return price; }
//
//}
