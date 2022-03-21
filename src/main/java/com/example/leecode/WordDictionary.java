package com.example.leecode;

import org.springframework.beans.BeanUtils;

import java.util.*;

/**
 * @Auther: HuangRui
 * @Date: 2021/1/12 09:51
 * @Description:
 */
public class WordDictionary {


        private Set<String> set;
        public WordDictionary() {
            set = new HashSet<>();
        }

        public void addWord(String word) {
            set.add(word);
        }

        public boolean search(String word) {
            return set.contains(word);
        }

    public static void main(String[] args) {
        WordDictionary obj = new WordDictionary();
        obj.addWord(null);
        obj.addWord("bad");
        obj.addWord("dad");
        System.out.println(obj.search("b.."));
    }


}
